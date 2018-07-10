import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/** Java Configuration Spring annotation */
@Configuration
/** Autowiring Spring annotation */
@ComponentScan({"com.pluralsight"})

@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
