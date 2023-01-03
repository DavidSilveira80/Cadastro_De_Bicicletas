package utils;

import java.util.Locale;
import java.util.Scanner;

public class EntradasCriarBike {

    public static String informarModeloBike(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o modelo da Bike: ");
        String modelo = entrada.nextLine();
        return modelo;
    }

    public static String informarCorBike(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a cor da Bike: ");
        String cor = entrada.nextLine();
        return cor;
    }

    public static String informarNomeComprador(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome do comprador: ");
        String nomeDoComprador = entrada.nextLine();
        return nomeDoComprador;
    }

    public static String informarNomeLoja(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome da loja: ");
        String nomeDaLoja = entrada.nextLine();
        return nomeDaLoja;
    }

    public static double informarPrecoBike(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o valor da Bike: R$ ");

        double preco = entrada.nextDouble();
        return preco;
    }
}
