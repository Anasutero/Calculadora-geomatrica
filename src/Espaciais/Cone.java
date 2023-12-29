package Espaciais;

public class Cone {
    double raio, altura;

    final double PI = Math.PI;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularAreaSuperficial(){
        return PI * this.raio * Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.raio, 2));
    }
    public double calcularVolume(){
        return 0.33 * PI * Math.pow(this.raio, 2) * this.altura;
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Raio do Cone: % .2f\nAltura do Cone: % .2f\nÁrea do Cone: %.2f\nVolume do Cone: %.2f", this.raio, this.altura, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
