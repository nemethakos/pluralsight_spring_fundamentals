import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);) {

			CustomerService customerService = ctx.getBean(CustomerService.class);

			System.out.format("Customers: %s %n", customerService.findAll().toString());
		}
	}

}
