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
import fr.utbm.ecommerce.dto.Product;
import fr.utbm.ecommerce.dto.Supplier;
import fr.utbm.ecommerce.dto.User;
import fr.utbm.ecommerce.repository.CategoryDao;
import fr.utbm.ecommerce.repository.UserDao;
import fr.utbm.ecommerce.service.CategoryService;
import fr.utbm.ecommerce.service.ProductService;
import fr.utbm.ecommerce.service.SupplierService;
import fr.utbm.ecommerce.service.UserService;

@SpringBootApplication
//(scanBasePackages={"fr.utbm.ecommerce", "fr.utbm.ecommerce.repository", "fr.utbm.ecommerce.service", "fr.utbm.ecommerce.dto", "fr.utbm.ecommerce.config"})
public class ECommerceApplication implements CommandLineRunner {
	@Autowired
	CategoryService cs;
	@Autowired
	 UserService us;
	@Autowired
	SupplierService ss;
	@Autowired
	ProductService ps;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		// User user;
		User user = new User("marwan", "alwan", "admin", "password", "marwan2@gmail.com", "0605908782",
				df.parse("2018-11-07"), "", "", "", "", df.parse("2018-11-07"), "");
		// us.addUser(user);
		// UserService uservic=new UserService();
		// uservic.addUser(user);
		// user=uservic.getUserByMail("marwanalwan94@gmail.com");
//		Category c = new Category("TECH", "Technologie phones");
//		cs.addCategory(c);
 
		Category c=new Category("Phone", "Phones");
		Supplier s=new Supplier("Supplier_name", "Supplier_lastname", "Suplier@gmail.com", "0010010010", df.parse("2018-11-07"), "paris", "20000", "paris", "Paris");
		 
		
		Product p=new Product("A1DF", "Samsung Galaxy S8 64 GB (Dual SIM) - Black "," - Android 8.0 - Version internationale", 400, 10, 15, 1, "Black", "photo_url", s, c);
		Product p1=new Product("A2DF", "Samsung Galaxy S7 64 GB (Dual SIM) - Red ","- Android 8.0 - Version internationale", 300, 10, 15, 1, "Red", "photo_url", s, c);
		Product p2=new Product("A3DF", "Samsung Galaxy S5 64 GB (Dual SIM) - Black ","- Android 8.0 - Version internationale", 100, 10, 15, 1, "Black", "photo_url", s, c);
		Product p3=new Product("A4DF", "Samsung Galaxy S4 64 GB (Dual SIM) - Yellow ","- Android 8.0 - Version internationale", 200, 10, 15, 1, "Yellow", "photo_url", s, c);
		Product p4=new Product("A5DF", "Samsung Galaxy S9 64 GB (Dual SIM) - Black ","- Android 8.0 - Version internationale", 800, 10, 15, 1, "Black", "photo_url", s, c);
		
		
	 
		user=us.getUserByMail("marwan@gmail.com");
		try{
//			us.addUser(user);
		System.out.println(p.toString());
//		cs.addCategory(c);
//	 	ss.addSupplier(s);
//		ps.addProduct(p);
//		ps.addProduct(p1);
//		ps.addProduct(p2);
//		ps.addProduct(p3);
//		ps.addProduct(p4);
 
		//user=us.getUserByMail("marwan@gmail.com");
//probleme sur le getuserbymail a revoir
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
