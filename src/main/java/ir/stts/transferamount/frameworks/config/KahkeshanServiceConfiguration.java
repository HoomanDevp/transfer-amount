package ir.stts.transferamount.frameworks.config;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Configuration
public class KahkeshanServiceConfiguration {

    private final Environment environment;

    public KahkeshanServiceConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public RestTemplate kahkeshanRestTemplate() throws IOException {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(10);
        connectionManager.setDefaultMaxPerRoute(10);

        try (CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connectionManager).build()) {
            return new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
        }
    }

    @Bean
    public TokenManager KahkeshanTokenManager() {
        return new ClientTokenManager(environment.getProperty("oauth.server.url"),
                environment.getProperty("oauth.server.clientId"),
                environment.getProperty("oauth.server.clientSecret"));
    }
}