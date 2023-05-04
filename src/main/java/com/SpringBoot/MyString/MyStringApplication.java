package com.SpringBoot.MyString;

import com.SpringBoot.MyString.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStringApplication.class, args);
        User user=new User();
		user.setFirstName("Muddy");
		user.setLastName("Mosses");
		user.setEmmail("mohammed@gmail.com");
	}

}
