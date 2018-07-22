package com.pluralsight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pluralsight")
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/pdfs/**").addResourceLocations("/WEB-INF/pdfs/");
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
		
	}

	@Bean
	public InternalResourceViewResolver getIRVR() {
		var result = new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
		return result;
	}
	
}
