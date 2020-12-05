package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.demo.examples.Person;
import com.app.demo.examples.Car;
import com.app.demo.examples.Condition;

@SpringBootApplication
public class JavabasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavabasicsApplication.class, args);
		Car car = new Car();
		car.setName("Ferrari");
		car.setModel(488);
		car.setColor("red");
		System.out.println(car.toString());
		
		Condition check = new Condition();
		
		Person person = new Person();
		person.setName("Alhaji Fofana");
		person.setAge(23);
		person.setHeight("6 foot 4 inch");
		person.setCar(car);
		System.out.println(person.toString());
		
		Person person2 = new Person();
		person2.setName("Sufyan Fofana");
		person2.setAge(27);
		person2.setHeight("5 foot 10 inch");
		System.out.println(person2.toString());
		
		
		if(check.isOlderThan(person, 35)) {
			System.out.println("executed");
		}
		
		if(check.isOlderThan(person2, 18)) {
			System.out.println("executed");
		}
	}

}
