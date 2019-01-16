package fr.utbm.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.utbm.ecommerce.service.OrderService;

@SpringBootApplication
//(scanBasePackages={"fr.utbm.ecommerce", "fr.utbm.ecommerce.repository", "fr.utbm.ecommerce.service", "fr.utbm.ecommerce.dto", "fr.utbm.ecommerce.config"})
public class ECommerceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

			}

}
