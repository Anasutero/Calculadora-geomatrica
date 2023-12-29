package Espaciais;

public class Cubo {
    double lado;
    public Cubo(double lado) {
        this.lado = lado;
    }
    public double calcularAreaSuperficial(){
        return Math.pow(this.lado, 2) * 6;
    }
    public double calcularVolume(){
        return Math.pow(this.lado, 3);
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Lado do Cubo: % .2f\nÁrea do Cubo: %.2f\nVolume do Cubo: %.2f", this.lado, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
