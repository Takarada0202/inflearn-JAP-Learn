package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hEllo = new Hello();
		hEllo.setData("hello");
		String data = hEllo.getData();
		System.out.println("data="+data);

		SpringApplication.run(JpashopApplication.class, args);
	}

}
