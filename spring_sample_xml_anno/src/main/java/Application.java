import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		try (var appContext = new ClassPathXmlApplicationContext("applicationContext.xml");) {

			var customerService = appContext.getBean("customerService", CustomerService.class);

			System.out.format("Customers: %s %n", customerService.findAll().toString());

		}
	}

}
