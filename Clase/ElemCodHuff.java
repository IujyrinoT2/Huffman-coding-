package Clase;

public class ElemCodHuff {
    protected char caracter;
    protected int frecventa;
    protected String codHuff;

    protected ElemCodHuff stanga;
    protected ElemCodHuff dreapta;

    public ElemCodHuff(char caracter, String codHuff) {
        this.caracter = caracter;
        this.codHuff = codHuff;
    }

    public ElemCodHuff(char caracter, int frecventa) {
        this.caracter = caracter;
        this.frecventa = frecventa;
    }

    @Override
    public String toString() {
        return "ElemCodHuff{" +
                "caracter=" + caracter +
                ", frecventa=" + frecventa +
                ", codHuff='" + codHuff + '\'' +
                '}';
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getFrecventa() {
        return frecventa;
    }

    public void setFrecventa(int frecventa) {
        this.frecventa = frecventa;
    }

    public String getCodHuff() {
        return codHuff;
    }

    public void setCodHuff(String codHuff) {
        this.codHuff = codHuff;
    }

    public ElemCodHuff getStanga() {
        return stanga;
    }

    public void setStanga(ElemCodHuff stanga) {
        this.stanga = stanga;
    }

    public ElemCodHuff getDreapta() {
        return dreapta;
    }

    public void setDreapta(ElemCodHuff dreapta) {
        this.dreapta = dreapta;
    }
}
