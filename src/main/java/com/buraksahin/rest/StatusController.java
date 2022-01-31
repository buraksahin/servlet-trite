package com.buraksahin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/health")
public class StatusController {
	@GET
	public String health() {
		return "OK";
	}
}
