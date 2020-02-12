package com.bankinggclient.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankinggclient.spring.soap.api.client.SoapClient;
import com.bankinggclient.spring.soap.api.loaneligibility.Acknowledgement;
import com.bankinggclient.spring.soap.api.loaneligibility.CustomerRequest;

@SpringBootApplication

@RestController
public class SpringBootSoapWebserviceClientApplication {

	
	@Autowired
	private SoapClient client;
	
	@PostMapping("/getLoanStatus")
	public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return client.getLoanStatus(request);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWebserviceClientApplication.class, args);
	}

}
