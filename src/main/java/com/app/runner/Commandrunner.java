package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@ Configuration
@Order(2)
public class Commandrunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		//System.out.println("form commnadrunner");
	}

}
