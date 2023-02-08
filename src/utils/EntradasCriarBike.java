package utils;

import java.util.Locale;
import java.util.Scanner;

public class EntradasCriarBike {

    public static String informarModeloBike(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("INFORME O MODELO DA BIKE: ");
        String modelo = entrada.nextLine();
        return modelo;
    }

    public static String informarCorBike(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("INFORME A COR DA BIKE: ");
        String cor = entrada.nextLine();
        return cor;
    }

    public static String informarNomeComprador(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("INFORME O NOME DO COMPRADOR: ");
        String nomeDoComprador = entrada.nextLine();
        return nomeDoComprador;
    }

    public static String informarNomeLoja(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("INFORME O NOME DA LOJA: ");
        String nomeDaLoja = entrada.nextLine();
        return nomeDaLoja;
    }

    public static double informarPrecoBike(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("INFORME O VALOR DA BIKE: R$ ");

        double preco = entrada.nextDouble();
        return preco;
    }
}
