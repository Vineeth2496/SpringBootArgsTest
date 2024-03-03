package com.SpringBootArgsTest.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestArgsRunner implements CommandLineRunner {
	@Value("${my.app.code}")
	private String code;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(code);
	}

}
