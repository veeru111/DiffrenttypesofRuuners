package com.app.orderinterface;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class SecondInterface implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("from the secondInterface3");
	}

}
