package com.example.hp.entidades;

public class Automovil {
    private String marca;
    private String Submarca;
    private String modelo;
    private String Anio;

    public Automovil() {

    }

    public Automovil(String marca, String submarca, String modelo, String anio) {
        this.marca = marca;
        Submarca = submarca;
        this.modelo = modelo;
        Anio = anio;
    }












    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return Submarca;
    }

    public void setSubmarca(String submarca) {
        Submarca = submarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }
}
