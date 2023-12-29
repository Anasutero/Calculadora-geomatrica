package Planas;

public class Triangulo {
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return this.lado * 3;
    }

    public double calcularArea(){
        return this.lado * Math.sqrt(0.75);
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Lado do Triângulo: % .2f\nÁrea do Triângulo: %.2f\nPerímetro do Triângulo: %.2f", this.lado, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
