package Planas;

public class Retangulo {

    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        return (2 * this.base) + (2 * this.altura);
    }
    public double calcularArea(){
        return this.base * this.altura;
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Base do Retângulo: % .2f\nAltura do Retângulo: % .2f\nÁrea do Retângulo: %.2f\nPerímetro do Retângulo: %.2f", this.base, this.altura, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
