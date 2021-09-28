package com.ceep.domain;

public class Vehiculo {
    private String matricula, marca, modelo, color;
    private Double tarifa;
    private boolean disponible;

    //CONSTRUCTOR
    public Vehiculo(String matricula, String marca, String modelo, String color, Double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    

    //GETTER AND SETTER
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
    
    
    
}
