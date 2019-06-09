package com.app.orderinterface;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class OrderInterface implements ApplicationRunner, Ordered {

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("from the 5 applicationrunner");
	}
}
