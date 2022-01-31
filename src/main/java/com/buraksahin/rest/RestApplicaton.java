package com.buraksahin.rest;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/example")
public class RestApplicaton extends Application{
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<>();
		classes.add(StatusController.class);
		classes.add(Test.class);
		System.out.println("example");
		System.out.println(new Date());
		return classes;
	}
	
}
