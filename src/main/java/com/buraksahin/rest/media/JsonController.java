package com.buraksahin.rest.media;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/v1")
public class JsonController {

	@GET
	@Produces("application/json; character=UTF-8")
	@Path("/sum/{number1}/{number}")
	public String sum(@PathParam("number1") String number1, @PathParam("number") String number) {
		int result = Integer.parseInt(number1) + Integer.parseInt(number);
		return Json.createObjectBuilder()
			.add("num1", number1)
			.add("num2", number)
			.add("sum", result)
			.build()
			.toString();
	}
	
	@GET
	@Path("/health")
	public String health() {
		return "OK";
	}
}
