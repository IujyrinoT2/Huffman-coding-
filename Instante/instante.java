package Instante;

import Clase.Criptare;
import Clase.Statistica;

public class instante {
    public static void main(String[] args) {
        Statistica stat = new Statistica();
        stat.Citire("text.txt");
        stat.AfFrecv();
        stat.AfisareGraf();
        stat.CreareArbore();
        Criptare cript = new Criptare();
        cript.CodareHuff(stat.getRad());
        System.out.println("\nH(A): " + stat.Entropy() + "[biti/caracter]");
        System.out.println("M = " + 2);
        System.out.println("Lungime medie cod: " + stat.LungimeMedieCod());
        System.out.println("Eficienta: " + stat.Entropy() / stat.LungimeMedieCod());
        System.out.println("Redundanta: " + (1 - stat.Entropy() / stat.LungimeMedieCod()));

        System.out.println(stat.Entropy() + " <= " + stat.LungimeMedieCod() + " < " + (stat.Entropy() + 1));
        if((stat.Entropy() <=  stat.LungimeMedieCod()) && (stat.LungimeMedieCod() < (stat.Entropy() + 1)))
            System.out.println("Teorema I a lui Shannon este verficata");
        else
            System.out.println("Teorema I a lui Shannon NU este verficata");
    }
}
