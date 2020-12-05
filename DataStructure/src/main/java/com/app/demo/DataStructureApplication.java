package com.app.demo;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.demo.model.Laptop;
import com.app.demo.repo.Repository;
import com.app.demo.service.AnimalService;

@SpringBootApplication
public class DataStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStructureApplication.class, args);
		
		Repository repo = new Repository();
		List<Laptop> laptops = repo.getListLaptop();
		
//		for (int i = 0; i < laptops.size(); i++) {
	//		System.out.println(laptops.get(i).getBrand());
	//	}
		
		for (Laptop laptop : laptops) {
		if(laptop.getBrand().equals("dell"))
			System.out.println(laptop.getModel() + "====");
	 }
		
		laptops.forEach(laptop -> { 
			if(laptop.getBrand().contains("a")) {
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getBrand());
			}
			
			});
		
		Map<String, Laptop> map = repo.getMappedLaptops();
		
		for (int i = 0; i < laptops.size(); i++) {
			System.out.println(map.get("lap"+(i+1)).getBrand());
		}
			
		for (String brand: map.keySet()) {
				System.out.println(map.get(brand).getBrand());
		}
		AnimalService animalService = new AnimalService();
		animalService.makeCatMeowAndWalk();
		animalService.makeDogBarkAndWalk();
	}

}