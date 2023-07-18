package org.lesson.java.geometria;

/*
* Main
* Chiedere imput Base e Altezza Rettangolo
* Stampare l'istanza ed il risultato dei metodi calcolaArea e calcolaPerimetro
*
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //variabili per l'istanza
        double baseRet;
        double heightRet;

        //questo counter tiene trqaccia degli errori dell'utente
        int counter = 0;

        //3 possibilità di errore
        for (int i = 0; i < 3; i++) {
            //input
            System.out.println("Inserisci la base del tuo Rettangolo: ");
            baseRet = input.nextDouble();
            System.out.println("Inserisci l'altezza del tuo Rettangolo: ");
            heightRet = input.nextDouble();

            //controllo che sia un rettangolo
            if (baseRet != heightRet) {
                //creazione istanza di Rettangolo
                Rettangolo rettangoloUser = new Rettangolo(baseRet, heightRet);

                //chiamata metodi calcola area e perimetro
                double area = rettangoloUser.calcolaArea();
                double perimetro = rettangoloUser.calcolaPerimetro();
                //output
                System.out.println("Il rettangolo che hai inserito ha una base di " + baseRet + "cm " + " ed un altezza di " + heightRet + "cm.");
                System.out.println("Il perimetro è di: " + perimetro + "cm.");
                System.out.println("L'area è di: " + area + "cm.");
                break;
            } else {
                System.out.println("Non hai inserito un rettangolo! Un rettangolo ha sempre base ed altezza diversi!");
                counter++;
            }

            if (counter == 3) {
                System.out.println("Torna quando avrai un rettangolo da inserire!");
            }
        }



    }
}
