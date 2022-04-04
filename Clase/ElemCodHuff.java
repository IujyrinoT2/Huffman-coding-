package Clase;

public class ElemCodHuff {
    protected char caracter;
    protected int frecventa;
    protected double probabilitate;
    protected String codHuff;

    protected ElemCodHuff stanga;
    protected ElemCodHuff dreapta;

    public ElemCodHuff(char caracter, int frecventa, double probabilitate, String codHuff) {
        this.caracter = caracter;
        this.frecventa = frecventa;
        this.probabilitate = probabilitate;
        this.codHuff = codHuff;
    }

    public ElemCodHuff(char caracter, int frecventa, double probabilitate) {
        this.caracter = caracter;
        this.frecventa = frecventa;
        this.probabilitate = probabilitate;
    }

    public ElemCodHuff(char caracter, String codHuff) {
        this.caracter = caracter;
        this.codHuff = codHuff;
    }

    public ElemCodHuff(char caracter, int frecventa) {
        this.caracter = caracter;
        this.frecventa = frecventa;
    }

    public ElemCodHuff(char caracter, int frecventa, String codHuff) {
        this.caracter = caracter;
        this.frecventa = frecventa;
        this.codHuff = codHuff;
    }

    @Override
    public String toString() {
        return "ElemCodHuff{" +
                "caracter=" + caracter +
                ", frecventa=" + frecventa +
                ", probabilitate=" + probabilitate +
                ", codHuff='" + codHuff + '\'' +
                '}';
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public double getProbabilitate() {
        return probabilitate;
    }

    public void setProbabilitate(double probabilitate) {
        this.probabilitate = probabilitate;
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
