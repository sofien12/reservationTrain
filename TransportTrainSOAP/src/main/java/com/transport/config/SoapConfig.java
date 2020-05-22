package com.transport.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapConfig extends WsConfigurerAdapter {
	private static final String NAME_SPACE=  "http://www.transport.com/ws/reservationsoap" ;
	
	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("Reservation.xsd"));
	}
	
	@Bean(name ="Reservation") 
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName("ReservationWSDL");
		defaultWsdl11Definition.setLocationUri("/ws");
		
		defaultWsdl11Definition.setSchema(schema);
		defaultWsdl11Definition.setTargetNamespace(NAME_SPACE);
		
		return defaultWsdl11Definition;
	}
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context){
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*");
	}

}
