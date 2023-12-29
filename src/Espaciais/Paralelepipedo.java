package Espaciais;

public class Paralelepipedo {
    double comprimento, altura, largura;

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }
    public double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }
    public double calcularVolume(){
        return this.comprimento * this.largura * this.altura;
    }
    public String retornaResumoDaForma(int valor){
        String resumo = String.format("Comprimento do Paralelepípedo: % .2f\nAltura do Paralelepípedo: % .2f\nLargura do Paralelepípedo: % .2f\nÁrea do Paralelepípedo: %.2f\nVolume do Paralelepípedo: %.2f", this.comprimento, this.altura, this.largura, this.calcularAreaSuperficial(), this.calcularVolume());

        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
