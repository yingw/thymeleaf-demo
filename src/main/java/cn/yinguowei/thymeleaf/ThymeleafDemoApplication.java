package cn.yinguowei.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
	}
}
