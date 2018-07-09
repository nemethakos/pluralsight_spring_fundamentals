import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** Java Configuration Spring annotation */
@Configuration
/** Autowiring Spring annotation */
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	/** Everything commented out since Autowiring is used */
	
	//@Bean(name="customerServiceImpl")
	//public CustomerService getCustomerService() {
		
		/** 
		 * Autowired Magic using the @Autowired annotation inside CustomerServiceImpl 
		 */
		//CustomerServiceImpl cs = new CustomerServiceImpl();
		
		/** Setter Injection 
		CustomerServiceImpl cs = new CustomerServiceImpl();
		cs.setCustomerRepository(getCustomerRepository());
		*/
		
		/** Constructor Injection 
		CustomerServiceImpl cs = new CustomerServiceImpl(getCustomerRepository());
		*/
		//return cs;
	//}
	
	/** No need to define if @Autowired is used
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
	*/
}
