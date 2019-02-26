package com.example.hp.calculadora;

public class Suma {
    private double Numberone;
    private double numbertwo;
    //quite el tipo de letra al nombre
    public Suma() {

        this.Numberone=0.0;
        this.numbertwo=0.0;
    }

    public Suma(double numberone, double numbertwo) {
        this.Numberone = numberone;
        this.numbertwo = numbertwo;
    }

    public double getNumberone() {
        return Numberone;
    }

    public void setNumberone(double numberone) {
        Numberone = numberone;
    }

    public double getNumbertwo() {
        return numbertwo;
    }

    public void setNumbertwo(double numbertwo) {
        this.numbertwo = numbertwo;
    }

    /**
     *
     * @return Devuelve la suma de dos numero
     */
    public double getSuma(){
        return this.Numberone+this.numbertwo;

    }
}

