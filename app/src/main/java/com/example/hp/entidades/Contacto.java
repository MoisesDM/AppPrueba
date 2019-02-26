package com.example.hp.entidades;

public class Contacto {
    private String nombre;
    private String nueroMovil;
    private String numeorprincipal;



    private int ImgContacto;

    public Contacto(){

    }

    public Contacto(String nombre, String nueroMovil, String numeorprincipal, int imgContacto) {
        this.nombre = nombre;
        this.nueroMovil = nueroMovil;
        this.numeorprincipal = numeorprincipal;
        ImgContacto = imgContacto;
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
    public int getImgContacto() {
        return ImgContacto;
    }

    public void setImgContacto(int imgContacto) {
        ImgContacto = imgContacto;
    }
}
