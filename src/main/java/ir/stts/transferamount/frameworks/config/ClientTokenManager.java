package ir.stts.transferamount.frameworks.config;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Map;
import java.util.Objects;

import java.time.Instant;

public class ClientTokenManager implements TokenManager {

    private final String tokenUrl;
    private final String clientId;
    private final String clientSecret;
    private final RestTemplate restTemplate;
    private String token;
    private Instant tokenExpiry;

    public ClientTokenManager(String tokenUrl, String clientId, String clientSecret) {
        this.tokenUrl = tokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.restTemplate = new RestTemplate();
    }

    @Override
    public String getToken() {
        if (token == null || Instant.now().isAfter(tokenExpiry)) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.setBasicAuth(clientId, clientSecret);

            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            body.add("grant_type", "client_credentials");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, headers);

            ResponseEntity<Map<String, String>> response = restTemplate.exchange(
                    tokenUrl, HttpMethod.POST, request, new ParameterizedTypeReference<>() {
                    });

            Map<String, String> responseBody = Objects.requireNonNull(response.getBody());
            token = responseBody.get("access_token");
            int expiresIn = Integer.parseInt(responseBody.get("expires_in"));
            tokenExpiry = Instant.now().plusSeconds(expiresIn);
        }
        return token;
    }
}