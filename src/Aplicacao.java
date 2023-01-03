import menus.Menus;
import models.Bicicleta;
import utils.EntradasCriarBike;
import utils.MetodosUtilitarios;

import java.util.Date;

import java.util.ArrayList;

//TODO CORRIGIR BUGS E REFATORAR
public class Aplicacao {
    public static void main(String[] args){
        ArrayList<Bicicleta> arrayDeBikes = new ArrayList<>();

        int parada = 0;
        while(parada == 0) {
            int option;
            do {
                Menus.menuPrincipal();
                System.out.print("Informe sua escolha: ");
                option = MetodosUtilitarios.entradaInteira();

                if (option == 1) {
                    System.out.println("CRIAR BIKE");
                    Date dataDeCompra = new Date();
                    arrayDeBikes.add(new Bicicleta(EntradasCriarBike.informarModeloBike(),
                            EntradasCriarBike.informarCorBike(),
                            EntradasCriarBike.informarPrecoBike(),
                            EntradasCriarBike.informarNomeComprador(),
                            EntradasCriarBike.informarNomeLoja(),
                            dataDeCompra));

                } else if (option == 2) {
                    System.out.println("LISTAR TODAS AS BIKES");
                    for(Bicicleta bike : arrayDeBikes){
                        System.out.println(bike.listarAtributosBike());
                    }

                } else if (option == 3) {
                    System.out.println("LISTAR UMA BIKE POR ID");
                    System.out.print("Informe o Id da Bike: ");
                    int idListarUmaBike = MetodosUtilitarios.entradaInteira();
                    if(MetodosUtilitarios.existeIdBike(arrayDeBikes, idListarUmaBike)){
                        System.out.println(MetodosUtilitarios.listarBikePorId(arrayDeBikes, idListarUmaBike));
                    }else{
                        System.out.println("Bike não existe");
                    }
                } else if (option == 4) {
                    System.out.println("ATUALIZAR TODAS AS INFOMAÇÔES DE UMA BIKE");
                    System.out.print("Informe o ID da bike que você quer atualizar: ");
                    int idModificarTodaBike = MetodosUtilitarios.entradaInteira();
                    for(Bicicleta bike: arrayDeBikes){
                        if(bike.getId().equals(idModificarTodaBike)){
                            bike.atualizarDadosBike();
                        }
                    }
                } else if (option == 5) {
                    System.out.println("ATUALIZAR UMA INFORMAÇÂO ESPECIFICA DE UMA BIKE");
                    int opcaoAtualizar = 0;
                    do{
                            Menus.menuAtualizaUmAtributo();
                            System.out.print("Informe sua escolha: ");
                            opcaoAtualizar = MetodosUtilitarios.entradaInteira();

                    }while(opcaoAtualizar != 1 && opcaoAtualizar !=2 && opcaoAtualizar !=3
                    && opcaoAtualizar != 4 && opcaoAtualizar != 5);
                    switch(opcaoAtualizar){
                        case 1:
                            System.out.println("ATUALIZAR MODELO");
                            System.out.print("Informe o ID da Bike: ");
                            int idModelo = MetodosUtilitarios.entradaInteira();
                            for(Bicicleta bike : arrayDeBikes){
                                if(bike.getId().equals(idModelo)){
                                    bike.setModelo(EntradasCriarBike.informarModeloBike());
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("ATUALIZAR COR");
                            System.out.print("Informe o ID da Bike: ");
                            int idCor = MetodosUtilitarios.entradaInteira();
                            for(Bicicleta bike : arrayDeBikes){
                                if(bike.getId().equals(idCor)){
                                    bike.setCor(EntradasCriarBike.informarCorBike());
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("ATUALIZAR PREÇO");
                            System.out.print("Informe o ID da Bike: ");
                            int idPreco = MetodosUtilitarios.entradaInteira();
                            for(Bicicleta bike : arrayDeBikes){
                                if(bike.getId().equals(idPreco)){
                                    bike.setPreco(EntradasCriarBike.informarPrecoBike());
                                    break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("ATUALIZAR NOME DO COMPRADOR");
                            System.out.print("Informe o ID da Bike: ");
                            int idNomeComprador = MetodosUtilitarios.entradaInteira();
                            for(Bicicleta bike : arrayDeBikes){
                                if(bike.getId().equals(idNomeComprador)){
                                    bike.setNomeDoComprador(EntradasCriarBike.informarNomeComprador());
                                    break;
                                }
                            }
                            break;
                        case 5:
                            System.out.println("ATUALIZAR LOJA");
                            System.out.print("Informe o ID da Bike: ");
                            int idNomeLoja = MetodosUtilitarios.entradaInteira();
                            for(Bicicleta bike : arrayDeBikes){
                                if(bike.getId().equals(idNomeLoja)){
                                    bike.setNomeDaLoja(EntradasCriarBike.informarNomeLoja());
                                    break;
                                }
                            }
                            break;
                    }
                } else if (option == 6) {
                    System.out.println("DELETAR UMA BIKE");
                    System.out.print("Informe o ID da bike que você quer remover: ");
                    int idBikeRemover = MetodosUtilitarios.entradaInteira();
                    for(Bicicleta bike : arrayDeBikes){
                        if(bike.getId().equals(idBikeRemover)){
                            arrayDeBikes.remove(bike);
                            break;
                        }
                    }
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
