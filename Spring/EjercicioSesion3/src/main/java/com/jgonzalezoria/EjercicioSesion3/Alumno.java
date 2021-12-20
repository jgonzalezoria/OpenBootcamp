package com.jgonzalezoria.EjercicioSesion3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {

    // atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String identityCardNumber;

    // constructores
    public Alumno(){

    }

    public Alumno(Long id, String name, String surname, String identityCardNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.identityCardNumber = identityCardNumber;
    }

    // getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    // toString

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityCardNumber='" + identityCardNumber + '\'' +
                '}';
    }
}
