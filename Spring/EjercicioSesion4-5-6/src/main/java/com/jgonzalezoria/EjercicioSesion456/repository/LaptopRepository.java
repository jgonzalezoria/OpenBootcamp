package com.jgonzalezoria.EjercicioSesion456.repository;

import com.jgonzalezoria.EjercicioSesion456.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
