import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			
			CustomerService customerService = ctx.getBean(CustomerService.class);
			System.out.format("CustomerServiceImpl: %s%n", customerService);
			
			CustomerService customerService2 = ctx.getBean(CustomerService.class);
			System.out.format("CustomerServiceImpl2: %s%n", customerService2);
			
			System.out.format("customerServiceImpl==customerServiceImpl2: %b%n", customerService==customerService2);

			System.out.format("Customers: %s %n", customerService.findAll().toString());
		}
	}

}
