package fr.utbm.ecommerce;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
 
public class RestController {
	@RequestMapping("/api/hello")
	 public String greet() {
	  return "Hello from the  spring boot!!!";
	 }
}
