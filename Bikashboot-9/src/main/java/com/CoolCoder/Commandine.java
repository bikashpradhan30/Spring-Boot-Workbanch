package com.CoolCoder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Commandine implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Coolcoder to commandline runner...");
		if(args.length>0) {
			System.out.println("Argument has been passed");
			for(String arg:args) {
				System.out.println(arg);
			}
		}
	}

}
