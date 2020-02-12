package com.bankinggclient.spring.soap.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration	
public class SoapConfig {

	//converts object in to xml by scanning below package
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller=new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.bankinggclient.spring.soap.api.loaneligibility");
		return marshaller;
	}
}
