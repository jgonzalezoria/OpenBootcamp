package com.jgonzalezoria.EjercicioSesion456;

import com.jgonzalezoria.EjercicioSesion456.entities.Laptop;
import com.jgonzalezoria.EjercicioSesion456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioSesion456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioSesion456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		// CRUD
		// crear un portatil
		Laptop laptop1 = new Laptop(null, "HP", "I7", 32, 1000, true);
		Laptop laptop2 = new Laptop(null, "TOSHIBA", "I5", 8, 1000, true);

		// almacenar un portatil
		repository.save(laptop1);
		repository.save(laptop2);

	}

}
