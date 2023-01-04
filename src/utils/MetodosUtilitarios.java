package utils;

import menus.Menus;
import models.Bicicleta;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodosUtilitarios {
    static int contador = 0;
    public static int incremento(){
        contador++;
        return contador;
    }

    public static int entradaInteira(){
        Scanner entrada = new Scanner(System.in);
        boolean continuaLeitura = true;
        int numero = 0;
        while(continuaLeitura){
            try{
                numero = Integer.parseInt(entrada.nextLine());
                continuaLeitura = false;
            }catch(NumberFormatException e){
                System.out.println("Entrada com valor inválido. Tente Novamente.");
                System.out.print("Informe sua escolha: ");
            }
        }
        return numero;
    }
    public static String listarBikePorId(ArrayList<Bicicleta> arrayBikes) {
        System.out.print("Informe o Id da Bike: ");
        int id = entradaInteira();
        String resposta = "";
        if(arrayBikes.contains(retornaBikeEspecifica(arrayBikes, id))){
            resposta = retornaBikeEspecifica(arrayBikes, id).listarAtributosBike();
        }else{
            resposta = "Bike não consta no cadastro";
        }
        return resposta;
    }
    public static Bicicleta retornaBikeEspecifica(ArrayList<Bicicleta> arrayBikes, int id){
        Bicicleta bikeRetornada = null;
        for(Bicicleta bike : arrayBikes){
            if(bike.getId().equals(id)){
                bikeRetornada = bike;
                break;
            }
        }
        return bikeRetornada;
    }
    public static void atualizarInfoDeUmaBike(ArrayList<Bicicleta> arrayBikes) {
        System.out.print("Informe o ID da bike que você quer atualizar: ");
        int id = entradaInteira();
        if(arrayBikes.contains(retornaBikeEspecifica(arrayBikes, id))){
            retornaBikeEspecifica(arrayBikes, id).atualizarDadosBike();
        }else{
            System.out.println("Bike não consta no cadastro");
        }
    }
    public static void atualizarUmaInfoEspecifica(ArrayList<Bicicleta> arrayBikes) {
        System.out.print("Informe o ID da Bike que quer atualizar: ");
        int id = entradaInteira();
        if(arrayBikes.contains(retornaBikeEspecifica(arrayBikes, id))){
            Bicicleta bike = retornaBikeEspecifica(arrayBikes, id);
            int opcaoAtualizar = 0;
            do {
                Menus.menuAtualizaUmAtributo();
                System.out.print("Informe sua escolha: ");
                opcaoAtualizar = entradaInteira();

            } while (opcaoAtualizar != 1 && opcaoAtualizar != 2 && opcaoAtualizar != 3
                    && opcaoAtualizar != 4 && opcaoAtualizar != 5 && opcaoAtualizar != 6);

            switch (opcaoAtualizar) {
                case 1:
                    System.out.println("ATUALIZAR MODELO");
                    bike.setModelo(EntradasCriarBike.informarModeloBike());
                    break;
                case 2:
                    System.out.println("ATUALIZAR COR");
                    bike.setCor(EntradasCriarBike.informarCorBike());
                    break;
                case 3:
                    System.out.println("ATUALIZAR PREÇO");
                    bike.setPreco(EntradasCriarBike.informarPrecoBike());
                    break;
                case 4:
                    System.out.println("ATUALIZAR NOME DO COMPRADOR");
                    bike.setNomeDoComprador(EntradasCriarBike.informarNomeComprador());
                    break;
                case 5:
                    System.out.println("ATUALIZAR LOJA");
                    bike.setNomeDaLoja(EntradasCriarBike.informarNomeLoja());
                    break;
                case 6:
                    System.out.println("Voltando ao menu principal");
                    break;
            }
        }else{
            System.out.println("Bike não consta no cadastro.");
        }

    }

    public static void deletarUmaBike(ArrayList<Bicicleta> arrayBikes) {
        System.out.print("Informe o ID da bike que você quer remover: ");
        int id = MetodosUtilitarios.entradaInteira();
        if(arrayBikes.contains(retornaBikeEspecifica(arrayBikes, id))){
            arrayBikes.remove(retornaBikeEspecifica(arrayBikes, id));
        }else{
            System.out.println("Bike não consta no cadastro.");
        }
    }
}
