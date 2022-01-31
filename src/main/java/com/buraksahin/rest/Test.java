package com.buraksahin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class Test {
	@GET
	public String getStatus() {
		return "test is ok";
	}
}
