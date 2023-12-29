package Espaciais;

public class Esfera {
    double raio;
    final double PI = Math.PI;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularAreaSuperficial(){
        return (PI * 4) * Math.pow(this.raio, 2);
    }
    public double calcularVolume(){
        return (1.33 * PI) * Math.pow(this.raio, 3);
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Raio da Esfera: % .2f\nÁrea da Esfera: %.2f\nVolume da Esfera: %.2f", this.raio, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
