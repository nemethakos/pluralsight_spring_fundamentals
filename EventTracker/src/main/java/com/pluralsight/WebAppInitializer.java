package com.pluralsight;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		WebApplicationContext rootContext = getContext();
		
		container.addListener(new ContextLoaderListener(rootContext));
		
		ServletRegistration.Dynamic dispatcher = 
				container.addServlet("DispatcherServlet",
				new DispatcherServlet(rootContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("*.html");
		dispatcher.addMapping("*.pdf");
		dispatcher.addMapping("*.css");
		dispatcher.addMapping("*.json");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext rootContext = 
				new AnnotationConfigWebApplicationContext();
		// for Spring 4 this is used
		// rootContext.setConfigLocation("com.pluralsight.WebConfig");
		// for Spring 5 this is needed 
		rootContext.register(WebConfig.class);
		return rootContext;
	}

}
