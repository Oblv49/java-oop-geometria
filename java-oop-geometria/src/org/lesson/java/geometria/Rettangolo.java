package org.lesson.java.geometria;

/*
* Classe Rettangolo
* fields: base e altezza del rettangolo
* Costruttore
* Metodi: calcolaArea - calcolaPerimetro
*/

public class Rettangolo {

    //fields
    double height;
    double base;


    //costructor
    public Rettangolo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //methods
        //calcola l'area del rettangolo
    public double calcolaArea() {
        return base * height;
    }

        //calcola il perimetro del rettangolo
    public double calcolaPerimetro() {
        return (base + height) * 2;
    }

}
