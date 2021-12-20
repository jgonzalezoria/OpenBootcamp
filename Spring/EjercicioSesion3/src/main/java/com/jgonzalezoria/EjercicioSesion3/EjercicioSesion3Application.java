package com.jgonzalezoria.EjercicioSesion3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioSesion3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioSesion3Application.class, args);
		AlumnoRepository repository = context.getBean(AlumnoRepository.class);

		System.out.println("El número de alumnos en base de datos es: " + repository.count());

		// crear y almacenar un alumno en la base de datos
		Alumno joseAlberto =new Alumno(null, "Jose Alberto", "Gonzalez Oria", "29491426K");
		repository.save(joseAlberto);

		System.out.println("El número de alumnos en base de datos es: " + repository.count());

		// recuperar todos los datos
		System.out.println(repository.findAll());

	}

}
