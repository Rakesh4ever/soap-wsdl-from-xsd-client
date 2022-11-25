/**
 * 
 */
package com.kumar.soap.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.soap.api.client.SoapClient;
import com.kumar.soap.api.wsdl.CustomerRequest;
import com.kumar.soap.api.wsdl.Feedback;



/**
 * @author Rakesh
 *
 */

@RestController
public class SoapController {
	
	@Autowired
	private SoapClient client;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/getLoanStatus")
	public Feedback invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return client.getLoanStatus(request);
	}

}
