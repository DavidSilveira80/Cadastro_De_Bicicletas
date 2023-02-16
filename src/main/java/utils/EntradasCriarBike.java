package utils;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.out;

public class EntradasCriarBike {

    public static String informarModeloBike(){
        Scanner entrada = new Scanner(System.in);
        String modelo;
        out.print("INFORME O MODELO DA BIKE: ");
        return modelo = entrada.nextLine();
    }

    public static String informarCorBike(){
        Scanner entrada = new Scanner(System.in);
        String cor;
        out.print("INFORME A COR DA BIKE: ");
        return cor = entrada.nextLine();
    }

    public static String informarNomeComprador(){
        Scanner entrada = new Scanner(System.in);
        String nomeDoComprador;
        out.print("INFORME O NOME DO COMPRADOR: ");
        return nomeDoComprador = entrada.nextLine();
    }

    public static String informarNomeLoja(){
        Scanner entrada = new Scanner(System.in);
        String nomeDaLoja;
        out.print("INFORME O NOME DA LOJA: ");
        return nomeDaLoja = entrada.nextLine();
    }

    public static double informarPrecoBike(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double preco;
        out.print("INFORME O VALOR DA BIKE: R$ ");
        return preco = entrada.nextDouble();
    }
}
