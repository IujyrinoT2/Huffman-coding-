package Clase;

public class Criptare extends Statistica{

    public void CodareHuff(ElemCodHuff Nod) {
        if (Nod.codHuff == null)
            Nod.codHuff = "";

        if(Nod.caracter != '#')
            System.out.println(Nod.caracter + ": " + Nod.codHuff);

        if(Nod.getStanga() != null) {
            Nod.getStanga().codHuff = Nod.getCodHuff() + "0";
            CodareHuff(Nod.stanga);
        }

        if(Nod.getDreapta() != null) {
            Nod.getDreapta().codHuff = Nod.getCodHuff() + "1";
            CodareHuff(Nod.dreapta);
        }
    }}

