package Espaciais;

public class Piramede {
    double arestaBase, apotema, altura;

    public Piramede(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }
    public double calcularAreaSuperficial(){
        return (2 * arestaBase * apotema) + Math.pow(this.arestaBase, 2);
    }
    public double calcularVolume(){
        return (Math.pow(this.arestaBase, 2) + this.altura) / 3;
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Aresta da Base da Pirâmide: % .2f\nAltura da Pirâmide: % .2f\nApótema da Pirâmide: % .2f\nÁrea da Pirâmide: %.2f\nVolume da Pirâmide: %.2f", this.arestaBase, this.altura, this.apotema, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
