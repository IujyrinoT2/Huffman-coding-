package Clase;

import java.io.*;

public class CitireFIsier {

    protected int[] frecventa = new int[31];
    protected static int NrCaractere = 0;
    public static String sursa;

    public void Citire(String sursaText) {
        try {
            sursa = sursaText;
            File file = new File(sursa);
            FileReader fileR = new FileReader(file);
            BufferedReader bufferR = new BufferedReader(fileR);
            int c;
            while((c = bufferR.read()) != -1)
            {
                char character = (char) c;
                Frecv(character);

                if((character >= 65 && character <= 90) || (character >= 97 && character <= 122) ||
                        c == 'Ă' || c == 'ă' || c == 'Â' || c == 'â' || c == 'Î' || c == 'î' || c == 'Ș' ||
                        c == 'ș' || c == 'Ț' || c == 'ț')
                    NrCaractere++;
            }
            System.out.println("Textul are " + NrCaractere + " de caractere");
        }
        catch (FileNotFoundException e) {
            System.out.println("Fisierul nu s-a putut deschide");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Frecv(char c) {
        if(c >= 65 && c <= 90)
            frecventa[c - 65]++;

        else if(c >= 97 && c <= 122)
            frecventa[c - 97]++;

        else if(c == 'Ă' || c == 'ă')
            frecventa[26]++;
        else if(c == 'Â' || c == 'â')
            frecventa[27]++;
        else if(c == 'Î' || c == 'î')
            frecventa[28]++;
        else if(c == 'Ș' || c == 'ș')
            frecventa[29]++;
        else if(c == 'Ț' || c == 'ț')
            frecventa[30]++;
    }
}
