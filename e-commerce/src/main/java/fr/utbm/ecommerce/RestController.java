package fr.utbm.ecommerce;
import org.springframework.web.bind.annotation.RequestMapping;
 
public class RestController {
	@RequestMapping("/api/hello")
	 public String greet() {
	  return "Hello from the  spring boot!!!";
	 }
}
