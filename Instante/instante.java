package Instante;

import Clase.Criptare;
import Clase.Statistica;

import java.util.Scanner;

public class instante {
    public static void main(String[] args) {
        Statistica stat = new Statistica();
        stat.Citire("/home/iujyrino/shkoala2/sem2/Cripto/text.txt");
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

        System.out.println("Mesajul de criptat: ");
        Scanner cin = new Scanner(System.in);
        String mesaj = cin.nextLine(), mesajCriptat, mesajDecriptat;
        mesajCriptat = cript.Encrypter(mesaj);

        System.out.println(mesajCriptat);

        mesajDecriptat = cin.nextLine();
        System.out.println(cript.Decrypter(mesajDecriptat));
    }
}
