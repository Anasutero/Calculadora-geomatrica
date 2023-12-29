package Planas;



public class Circulo {
    double raio;
    final double PI = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 2 * this.PI * this.raio;
    }

    public double calcularArea(){
        return Math.pow(this.raio, 2) * this.PI;
    }

    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Raio do círculo: % .2f\nÁrea do Círculo: %.2f\nPerímetro do Círculo: %.2f", this.raio, this.calcularArea(), this.calcularPerimetro());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
