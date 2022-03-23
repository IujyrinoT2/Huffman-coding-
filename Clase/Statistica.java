package Clase;

import java.util.*;

public class Statistica extends CitireFIsier{
    protected List<ElemCodHuff> ListaElem;
    public List<ElemCodHuff> ListaElem2;
    protected List<ElemCodHuff> ListaElemCodate = new ArrayList<>();

    private final double[] probabilitate = new double[31];
    private double SumProb = 0.0;
    private final int[] procentaj = new int [31];

    protected char[] caract = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
                    ,'P','Q','R','S','T','U','V','W','X','Y','Z','Ă', 'Â', 'Î', 'Ș', 'Ț'};
    protected ElemCodHuff Rad = null;

    public ElemCodHuff getRad() {
        return Rad;
    }

    protected void GenerareLista() {
        ListaElem = new ArrayList<>();
        ListaElem2 = new ArrayList<>();

        for(int i = 0; i < frecventa.length; i++) {
            ListaElem.add(new ElemCodHuff(caract[i], frecventa[i]));

        }

        var ConvLista = ListaElem.toArray();
        System.out.println(Arrays.deepToString(ConvLista));

        ListaElem2.addAll(ListaElem);
    }

    public void CreareArbore() {
        GenerareLista();

        ListaElem.sort(Comparator.comparingInt(elem -> elem.frecventa));

        while(ListaElem.size() > 1) {
            ListaElem.add(new ElemCodHuff('#', ListaElem.get(0).frecventa + ListaElem.get(1).frecventa));

            ListaElem.get(ListaElem.size() - 1).setStanga(ListaElem.get(0));
            ListaElem.get(ListaElem.size() - 1).setDreapta(ListaElem.get(1));

            ListaElem.remove(0);
            ListaElem.remove(0);

            ListaElem.sort(Comparator.comparingInt(elem -> elem.frecventa));
        }

        Rad = ListaElem.get(0);

        var ConvLista = ListaElem.toArray();
        System.out.println(Arrays.deepToString(ConvLista));
    }





    public void AfFrecv() {
        for(int i = 65; i < 91; i++) {
            if(frecventa[i-65] < 10)
                System.out.println("Caracterul: " + (char) i + "\t| " + frecventa[i - 65] + "\t\t| " + frecventa[i - 65] / (double) NrCaractere);
            else
                System.out.println("Caracterul: " + (char) i + "\t| " + frecventa[i - 65] + "\t| " + frecventa[i - 65] / (double) NrCaractere);

            probabilitate[i - 65] = frecventa[i - 65] / (double) NrCaractere;
            SumProb += probabilitate[i - 65];
            procentaj[i - 65] = (int)((frecventa[i - 65] / (double) NrCaractere) * 100);
        }

        if(frecventa[26] < 10)
            System.out.println("Caracterul: " + 'Ă' + "\t| " + frecventa[26] + "\t\t| " + frecventa[26] / (double) NrCaractere);
        else
            System.out.println("Caracterul: " + 'Ă' + "\t| " + frecventa[26] + "\t| " + frecventa[26] / (double) NrCaractere);
        probabilitate[26] = frecventa[26] / (double) NrCaractere;
        SumProb += probabilitate[26];
        procentaj[26] = (int)((frecventa[26] / (double) NrCaractere) * 100);

        if(frecventa[27] < 10)
            System.out.println("Caracterul: " + 'Â' + "\t| " + frecventa[27] + "\t\t| "+ frecventa[27] / (double) NrCaractere);
        else
            System.out.println("Caracterul: " + 'Â' + "\t| " + frecventa[27] + "\t| "+ frecventa[27] / (double) NrCaractere);
        probabilitate[27] = frecventa[27] / (double) NrCaractere;
        SumProb += probabilitate[27];
        procentaj[27] = (int)((frecventa[27] / (double) NrCaractere) * 100);

        if(frecventa[28] < 10)
            System.out.println("Caracterul: " + 'Î' + "\t| " + frecventa[28] + "\t\t| "+ frecventa[28] / (double) NrCaractere);
        else
            System.out.println("Caracterul: " + 'Î' + "\t| " + frecventa[28] + "\t| "+ frecventa[28] / (double) NrCaractere);
        probabilitate[28] = frecventa[28] / (double) NrCaractere;
        SumProb += probabilitate[28];
        procentaj[28] = (int)((frecventa[28] / (double) NrCaractere) * 100);

        if(frecventa[29] < 10)
            System.out.println("Caracterul: " + 'Ș' + "\t| " + frecventa[29] + "\t\t| "+ frecventa[29] / (double) NrCaractere);
        else
            System.out.println("Caracterul: " + 'Ș' + "\t| " + frecventa[29] + "\t| "+ frecventa[29] / (double) NrCaractere);
        probabilitate[29] = frecventa[29] / (double) NrCaractere;
        SumProb += probabilitate[29];
        procentaj[29] = (int)((frecventa[29] / (double) NrCaractere) * 100);

        if(frecventa[30] < 10)
            System.out.println("Caracterul: " + 'Ț' + "\t| " + frecventa[30] + "\t| "+ frecventa[30] / (double) NrCaractere);
        else
            System.out.println("Caracterul: " + 'Ț' + "\t| " + frecventa[30] + "\t| "+ frecventa[30] / (double) NrCaractere);
        probabilitate[30] = frecventa[30] / (double) NrCaractere;
        SumProb += probabilitate[30];
        procentaj[30] = (int)((frecventa[30] / (double) NrCaractere) * 100);

        System.out.println("Suma probabilitatilor: " + SumProb + " / 1");
    }



    public void AfisareGraf() {
        char[] caractRoman = {'Ă', 'Â', 'Î', 'Ș', 'Ț'};
        System.out.println("Graficul procentajului de aparitie al caracterelor:");
        for(int i = 65; i < 91; i++) {
            System.out.print((char)i + ": [");
            for(int j = 0; j < procentaj[i - 65]; j++)
                System.out.print("#");
            System.out.println("] " + procentaj[i - 65] + "%");
        }

        for(int i = 0, k = 26; i < 5; i++, k++) {
            System.out.print(caractRoman[i] + ": [");
            for(int j = 0; j < procentaj[k]; j++)
                System.out.print("#");
            System.out.println("] " + procentaj[k] + "%");
        }

    }

     private double log2(double x)
    {
        return (Math.log(x) / Math.log(2));
    }

    public double Entropy() {

        double entropy = 0;
        for (double prob : probabilitate)
            if (prob > 0)
                entropy += prob * log2(1 / prob);

        return entropy;
    }

    public double LungimeMedieCod() {
       double S = 0;
//S = prob * lungime cod

        for(var elem : ListaElem2)
            S += (elem.frecventa / (double)NrCaractere) * elem.codHuff.length();

     return S;
    }

}