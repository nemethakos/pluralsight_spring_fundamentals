import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		System.out.format("Customers: %s %n", customerService.findAll().toString());
	}

}
