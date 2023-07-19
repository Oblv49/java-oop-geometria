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

        //bonus
    void draw(char marker) {
        //prima lineea
        for (int i = 0; i < base; i++) {
            System.out.print(marker);
        }

        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print(marker);
            for (int j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(marker);
        }

        //seconda linea
        for (int i = 0; i < base; i++) {
            System.out.print(marker);

        }
    }


}
