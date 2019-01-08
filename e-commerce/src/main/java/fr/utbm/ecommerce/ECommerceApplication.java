package fr.utbm.ecommerce;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.utbm.ecommerce.dto.Category;
import fr.utbm.ecommerce.dto.User;
import fr.utbm.ecommerce.repository.CategoryDao;
import fr.utbm.ecommerce.repository.UserDao;
import fr.utbm.ecommerce.service.CategoryService;
import fr.utbm.ecommerce.service.UserService;

@SpringBootApplication
//(scanBasePackages={"fr.utbm.ecommerce", "fr.utbm.ecommerce.repository", "fr.utbm.ecommerce.service", "fr.utbm.ecommerce.dto", "fr.utbm.ecommerce.config"})
public class ECommerceApplication implements CommandLineRunner {
	@Autowired
	CategoryService cs;
	@Autowired
	 UserService us;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			}

}
