package com.example.switchyard.webservice_bridging;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder
{

	/**
	 * The Camel route is configured via this method.  The from:
	 * endpoint is required to be a SwitchYard service.
	 */
	public void configure()
	{
		// TODO Auto-generated method stub
		System.out.println("[CamelServiceRoute] Start");
		
		from("switchyard://HelloWorldProxy")
			.log("Received message for 'HelloWorld' : ${body}")
			.to("switchyard://HelloWorld");
		
		System.out.println("[CamelServiceRoute] End");
	}

}
