package com.buraksahin.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/health")
public class StatusController {
	@GET
	public String health() {
		System.out.println(new Date());
		return "OK";
	}
}
