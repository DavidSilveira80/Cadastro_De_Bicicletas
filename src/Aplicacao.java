import menus.Menus;
import models.Bicicleta;
import utils.EntradasCriarBike;
import utils.Metodos;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Bicicleta> arrayDeBikes = new ArrayList<>();

        int parada = 0;
        while(parada == 0) {
            int option;
            do {

                Menus.menuPrincipal();
                System.out.print("Informe sua escolha: ");
                option = Metodos.entradaInteira();


                if (option == 1) {
                    System.out.println("CRIAR BIKE");
                    Date dataDeCompra = new Date();
                    arrayDeBikes.add(new Bicicleta(EntradasCriarBike.informarModeloBike(),
                            EntradasCriarBike.informarCorBike(),
                            EntradasCriarBike.informarPrecoBike(), EntradasCriarBike.informarNomeComprador(),
                            EntradasCriarBike.informarNomeLoja(),
                            dataDeCompra));

                } else if (option == 2) {
                    System.out.println("LISTAR TODAS AS BIKES");
                    for(Bicicleta bike : arrayDeBikes){
                        System.out.println("============================");
                        System.out.println("       Bike -> " + bike.getId());
                        System.out.println(" Modelo: " + bike.getModelo());
                        System.out.println(" Cor: " + bike.getCor());
                        System.out.println(" Preço: " + bike.getPreco());
                        System.out.println(" Comprador: " + bike.getNomeDoComprador());
                        System.out.println(" Loja: " + bike.getNomeDaLoja());
                        System.out.println(" Data da compra: " + bike.getDataDeCompra());


                    }

                } else if (option == 3) {
                    System.out.println("LISTAR UMA BIKE POR ID");
                } else if (option == 4) {
                    System.out.println("ATUALIZAR TODAS AS INFOMAÇÔES DE UMA BIKE");
                } else if (option == 5) {
                    System.out.println("ATUALIZAR UMA INFORMAÇÂO ESPECIFICA DE UMA BIKE");
                } else if (option == 6) {
                    System.out.println("DELETAR UMA BIKE");
                } else if (option == 7) {
                    System.out.println("SAIR");
                    System.out.println("ENCERRANDO");
                    parada = 1;
                }
            }while (option != 1 && option != 2 && option != 3 &&
                    option != 4 && option != 5 && option != 6 && option != 7);
        }
    }
}
