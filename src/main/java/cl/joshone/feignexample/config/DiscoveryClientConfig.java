package cl.joshone.feignexample.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!local")
@Configuration
@EnableDiscoveryClient
public class DiscoveryClientConfig {
}
