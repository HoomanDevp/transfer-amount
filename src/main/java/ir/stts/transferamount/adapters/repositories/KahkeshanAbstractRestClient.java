package ir.stts.transferamount.adapters.repositories;

import ir.stts.transferamount.frameworks.config.TokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public abstract class KahkeshanAbstractRestClient {

    private final String baseUrl;
    private final RestTemplate restTemplate;

    @Autowired
    private TokenManager tokenManager;

    public KahkeshanAbstractRestClient(String baseUrl, RestTemplate restTemplate) {
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    protected <T, R> R post(String endpoint, T requestBody, Class<R> responseType) {
        String url = baseUrl + endpoint;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.setBearerAuth(tokenManager.getToken());
        HttpEntity<T> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<R> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, responseType);
        return response.getBody();
    }

    protected <T, R> R get(String endpoint, Class<R> responseType) {
        String url = baseUrl + endpoint;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.setBearerAuth(tokenManager.getToken());
        HttpEntity<T> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<R> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, responseType);
        return response.getBody();
    }
}