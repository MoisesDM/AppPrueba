package com.example.hp.entidades;

public class Contacto {
    private String nombre;
    private String nueroMovil;
    private String numeorprincipal;

    public Contacto(){

    }

    public Contacto(String nombre, String nueroMovil, String numeorprincipal) {

        this.setNombre(nombre);
        this.setNueroMovil(nueroMovil);
        this.setNumeorprincipal(numeorprincipal);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNueroMovil() {
        return nueroMovil;
    }

    public void setNueroMovil(String nueroMovil) {
        this.nueroMovil = nueroMovil;
    }

    public String getNumeorprincipal() {
        return numeorprincipal;
    }

    public void setNumeorprincipal(String numeorprincipal) {
        this.numeorprincipal = numeorprincipal;
    }
}
