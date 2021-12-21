package com.jgonzalezoria.EjercicioSesion456.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String processor;
    private Integer ramGB;
    private Integer hardDriveGB;
    private Boolean isSSD;

    // constructores

    public Laptop() {
    }

    public Laptop(Long id, String manufacturer, String processor, Integer ramGB, Integer hardDriveGB, Boolean isSSD) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramGB = ramGB;
        this.hardDriveGB = hardDriveGB;
        this.isSSD = isSSD;
    }

    // getter y setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getRamGB() {
        return ramGB;
    }

    public void setRamGB(Integer ramGB) {
        this.ramGB = ramGB;
    }

    public Integer getHardDriveGB() {
        return hardDriveGB;
    }

    public void setHardDriveGB(Integer hardDriveGB) {
        this.hardDriveGB = hardDriveGB;
    }

    public Boolean getSSD() {
        return isSSD;
    }

    public void setSSD(Boolean SSD) {
        isSSD = SSD;
    }

    // toString


    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramGB=" + ramGB +
                ", hardDriveGB=" + hardDriveGB +
                ", isSSD=" + isSSD +
                '}';
    }
}
