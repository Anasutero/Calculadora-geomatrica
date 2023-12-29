package Espaciais;

public class Cilindro {
    double raio, altura;

    final double PI = Math.PI;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return (2 * PI * this.raio * this.altura) + (2 * PI * Math.pow(this.raio, 2));
    }

    public double calcularVolume(){
        return PI * this.altura * Math.pow(this.raio, 2);
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Raio do Cilindro: % .2f\nAltura do Cilindro: % .2f\nÁrea do Cilindro: %.2f\nVolume do Cilindro: %.2f", this.raio, this.altura, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
