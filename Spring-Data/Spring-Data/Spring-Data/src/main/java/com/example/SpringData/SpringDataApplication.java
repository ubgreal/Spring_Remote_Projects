package com.example.SpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);

		CarRepository repository = context.getBean(CarRepository.class);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		// crear y almacenar un coche en base de datos
		Car toyota = new Car(null, "Toyota", "Prius", 2010);
		repository.save(toyota);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		// recuperar todos
		System.out.println(repository.findAll());
	}

}

