package Planas;

public class Quadrado {
    double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return Math.pow(this.lado, 2);
        //  Math.pow é uma função que serve para elevar números.
    }

    public double calcularPerimetro(){
        return this.lado * 4;
    }


    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Lado do Quadrado: % .2f\nÁrea do Quadrado: %.2f\nPerímetro do Quadrado: %.2f", this.lado, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
