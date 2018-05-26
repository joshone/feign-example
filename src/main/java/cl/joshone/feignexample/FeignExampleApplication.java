package cl.joshone.feignexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cl.joshone.feignexample.feign")
public class FeignExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignExampleApplication.class, args);
	}
}
