import Planas.*;
import Espaciais.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int opcaoMenu;

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        do {
            System.out.println("\nOlá " + nome + ", seja bem vindo a Calculadora Geométrica!");
            System.out.println("1.Figuras Planas\n2.Figuras Espaciais\n3.Sair");
            System.out.println("Escolha uma opção: ");

            while (!leia.hasNextInt()) {
                System.out.println("Opção Inválida! Digite um número válido.");
                leia.next();
            }
            opcaoMenu = leia.nextInt();

            switch (opcaoMenu) {
                case 1:
                    int opcaoFiguraPlana;
                    System.out.println("\nFiguras planas: ");
                    System.out.println("\n1.Círculo\n2.Hexágono\n3.Quadrado\n4.Retângulo\n5.Triângulo");
                    System.out.println("\nEscolha uma figura plana: ");

                    while (!leia.hasNextInt()) {
                        System.out.println("Opção Inválida! Digite um número válido.");
                    }
                    opcaoFiguraPlana = leia.nextInt();

                    switch (opcaoFiguraPlana) {

                        case 1 -> {
                            double raio;

                            while (true) {
                                try {
                                    System.out.println("Digite o raio do Círculo: ");
                                    raio = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Circulo circulo = new Circulo(raio);
                            if (raio > 0) {
                                System.out.println(circulo.calcularPerimetro());
                                System.out.println(circulo.calcularArea());
                                System.out.println(circulo.retornaResumoDaForma(1));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }

                        case 2-> {
                            double lado;

                            while (true) {
                                try {
                                    System.out.println("Digite o lado do Hexágono: ");
                                    lado = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Hexagono hexagono = new Hexagono(lado);
                            if (lado > 0) {
                                System.out.println(hexagono.calcularPerimetro());
                                System.out.println(hexagono.calcularArea());
                                System.out.println(hexagono.retornaResumoDaForma(2));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }

                        case 3-> {
                            double lado;

                            while (true) {
                                try {
                                    System.out.println("Digite o lado Quadrado: ");
                                    lado = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Quadrado quadrado = new Quadrado(lado);
                            if (lado > 0) {
                                System.out.println(quadrado.calcularPerimetro());
                                System.out.println(quadrado.calcularArea());
                                System.out.println(quadrado.retornaResumoDaForma(3));
                            } else {
                                System.out.println("Valor Inválido!");
                            }

                        }

                        case 4->{
                            double base, altura;

                            while (true) {
                                try {
                                    System.out.println("Digite a base do Retângulo: ");
                                    base = leia.nextDouble();
                                    System.out.println("Digite a altura do Retângulo");
                                    altura = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Retangulo retangulo = new Retangulo(base, altura);
                            if (base > 0 && altura > 0) {
                                System.out.println(retangulo.calcularPerimetro());
                                System.out.println(retangulo.calcularArea());
                                System.out.println(retangulo.retornaResumoDaForma(4));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }

                        case 5-> {
                            double lado;

                            while (true) {
                                try {
                                    System.out.println("Digite o lado do Triângulo: ");
                                    lado = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Triangulo triangulo = new Triangulo(lado);
                            if (lado > 0) {
                                System.out.println(triangulo.calcularPerimetro());
                                System.out.println(triangulo.calcularArea());
                                System.out.println(triangulo.retornaResumoDaForma(5));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }
                    }

                case 2:

                    int opcaoFiguraEspacial;
                    System.out.println("\nFiguras Espaciais: ");
                    System.out.println("\n1.Cilindro\n2.Cone\n3.Cubo\n4.Esfera\n5.Paralelepípedo\n6.Pirâmide");
                    System.out.println("\nEscolha uma figura espacial: ");

                    while (!leia.hasNextInt()) {
                        System.out.println("Opção Inválida! Digite um número válido.");
                    }
                    opcaoFiguraEspacial = leia.nextInt();

                    switch (opcaoFiguraEspacial) {

                        case 1 ->{
                            double raio, altura;

                            while (true) {
                                try {
                                    System.out.println("Digite o raio do Cilindro: ");
                                    raio = leia.nextDouble();
                                    System.out.println("Digite a altura do Cilindro: ");
                                    altura = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Cilindro cilindro = new Cilindro(raio, altura);
                            if (raio > 0 && altura > 0) {
                                System.out.println(cilindro.calcularVolume());
                                System.out.println(cilindro.calcularAreaSuperficial());
                                System.out.println(cilindro.retornaResumoDaForma(6));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }

                        case 2 -> {

                            double raio, altura;

                            while (true) {
                                try {
                                    System.out.println("Digite o raio do Cone: ");
                                    raio = leia.nextDouble();
                                    System.out.println("Digite a altura do Cone: ");
                                    altura = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Cilindro cone = new Cilindro(raio, altura);
                            if (raio > 0 && altura > 0) {
                                System.out.println(cone.calcularVolume());
                                System.out.println(cone.calcularAreaSuperficial());
                                System.out.println(cone.retornaResumoDaForma(7));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }

                        case 3 ->{
                            double lado;

                            while (true) {
                                try {
                                    System.out.println("Digite o lado do Cubo: ");
                                    lado = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Cubo cubo = new Cubo(lado);
                            if (lado > 0) {
                                System.out.println(cubo.calcularVolume());
                                System.out.println(cubo.calcularAreaSuperficial());
                                System.out.println(cubo.retornaResumoDaForma(8));
                            } else {
                                System.out.println("Valor Inválido!");
                            }

                        }
                        case 4 -> {
                            double raio;

                            while (true) {
                                try {
                                    System.out.println("Digite o raio do Cilindro: ");
                                    raio = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Esfera esfera = new Esfera(raio);
                            if (raio > 0) {
                                System.out.println(esfera.calcularVolume());
                                System.out.println(esfera.calcularAreaSuperficial());
                                System.out.println(esfera.retornaResumoDaForma(9));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }
                        case 5 ->{

                            double comprimento, altura, largura;

                            while (true) {
                                try {
                                    System.out.println("Digite o comprimento do Paralelepípedo: ");
                                    comprimento = leia.nextDouble();
                                    System.out.println("Digite a largura do Paralelepípedo: ");
                                    largura = leia.nextDouble();
                                    System.out.println("Digite a altura do Paralelepípedo: ");
                                    altura = leia.nextDouble();

                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                            if (comprimento > 0 && largura > 0 && altura > 0) {
                                System.out.println(paralelepipedo.calcularVolume());
                                System.out.println(paralelepipedo.calcularAreaSuperficial());
                                System.out.println(paralelepipedo.retornaResumoDaForma(10));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }
                        case 6 -> {
                            double arestaBase, apotema, altura;

                            while (true) {
                                try {
                                    System.out.println("Digite a aresta da base da Pirâmide: ");
                                    arestaBase = leia.nextDouble();
                                    System.out.println("Digite o apótema da Pirâmide: ");
                                    apotema = leia.nextDouble();
                                    System.out.println("Digite a altura da Pirâmide: ");
                                    altura = leia.nextDouble();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Valor Inválido!");
                                    leia.next();
                                }
                            }
                            Piramede piramide = new Piramede(arestaBase, altura, apotema);
                            if (arestaBase > 0 && apotema > 0 && altura > 0) {
                                System.out.println(piramide.calcularVolume());
                                System.out.println(piramide.calcularAreaSuperficial());
                                System.out.println(piramide.retornaResumoDaForma(11));
                            } else {
                                System.out.println("Valor Inválido!");
                            }
                        }
                    }
            }
        } while (opcaoMenu != 3);
    }
}