package Clase;

import java.util.Comparator;

public class Criptare extends Statistica{

    public void CodareHuff(ElemCodHuff Nod) {
        if (Nod.codHuff == null)
            Nod.codHuff = "";

        if(Nod.caracter != '#') {
            System.out.println(Nod.caracter + ": " + Nod.codHuff);
            ListaElemCodate.add(new ElemCodHuff(Nod.caracter, Nod.codHuff));
        }

        if(Nod.getStanga() != null) {
            Nod.getStanga().codHuff = Nod.getCodHuff() + "0";
            CodareHuff(Nod.stanga);
        }

        if(Nod.getDreapta() != null) {
            Nod.getDreapta().codHuff = Nod.getCodHuff() + "1";
            CodareHuff(Nod.dreapta);
        }
    }

    public String Encrypter(String mesajClar) {
        mesajClar = mesajClar.toUpperCase();
        String mesajCriptat = "";

        while(!mesajClar.replace(' ', 'Q').equals(mesajClar))            // Adaugam Q in loc de spatii
                mesajClar = mesajClar.replace(' ', 'Q');

        for(int i = 0; i < mesajClar.length(); i++) {
            for(var elem : ListaElemCodate) {
                if(mesajClar.toCharArray()[i] == elem.caracter)
                    mesajCriptat = mesajCriptat.concat(elem.codHuff);

            }
        }
        return mesajCriptat;
    }

    private char SearchElem(String elemCautat) {

        ListaElemCodate.sort(Comparator.comparingInt(elem -> elem.codHuff.length()));

        if(elemCautat.length() < ListaElemCodate.get(0).codHuff.length())          // Daca lungimea elem curaent este mai mica decat lungimea
            return 0;                                                              // celui mai mic element atunci nu exista

        for(var elem : ListaElemCodate) {
            if (elem.codHuff.equals(elemCautat))
                return elem.caracter;

        }

        return 0;
    }

    public String Decrypter(String mesajCriptat) {
        StringBuilder mesajDecrtiptat = new StringBuilder();
        String cuvCurent;
        int cuvStart = 0, cuvEnd = 1;

        while(cuvEnd < mesajCriptat.length() + 1) {
            cuvCurent = mesajCriptat.substring(cuvStart, cuvEnd);
            //System.out.println("cuvCurent=" + cuvCurent);
            if(SearchElem(cuvCurent) != 0) {
                mesajDecrtiptat.append(SearchElem(cuvCurent));
                cuvStart = cuvEnd;
            }
            cuvEnd++;
        }
        return mesajDecrtiptat.toString();
    }
}

