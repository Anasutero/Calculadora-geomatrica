package Planas;

public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 6;
    }

    public double calcularArea(){
        return this.lado * 6 * Math.sqrt(0.75);
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Lado do Hexágono: % .2f\nÁrea do Hexágono: %.2f\nPerímetro do Hexágono: %.2f", this.lado, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
