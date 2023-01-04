import menus.Menus;
import models.Bicicleta;
import utils.EntradasCriarBike;
import utils.MetodosUtilitarios;
import java.util.Date;
import java.util.ArrayList;

//TODO CORRIGIR BUGS E REFATORAR MÉTODO DE ATUALIZAÇÂO DE UM ATRIBUTO DA BIKE
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
                    if(arrayDeBikes.isEmpty()){
                        System.out.println("Não há bikes cadastradas");
                    }else{
                        for(Bicicleta bike : arrayDeBikes) {
                            System.out.println(bike.listarAtributosBike());
                        }
                    }

                } else if (option == 3) {
                    System.out.println("LISTAR UMA BIKE POR ID");
                    if(arrayDeBikes.isEmpty()) {
                        System.out.println("Não há bikes cadastradas");
                    }else {
                        System.out.println(MetodosUtilitarios.listarBikePorId(arrayDeBikes));
                    }

                } else if (option == 4) {
                    System.out.println("ATUALIZAR TODAS AS INFOMAÇÔES DE UMA BIKE");
                    if(arrayDeBikes.isEmpty()){
                        System.out.println("Não há Bikes cadastradas");
                    }else {
                        MetodosUtilitarios.atualizarInfoDeUmaBike(arrayDeBikes);
                    }

                } else if (option == 5) {
                    System.out.println("ATUALIZAR UMA INFORMAÇÂO ESPECIFICA DE UMA BIKE");
                    if(arrayDeBikes.isEmpty()){
                        System.out.println("Não há bikes cadastradas");
                    }else {
                        MetodosUtilitarios.atualizarUmaInfoEspecifica(arrayDeBikes);
                    }

                } else if (option == 6) {
                    System.out.println("DELETAR UMA BIKE");
                    if(arrayDeBikes.isEmpty()){
                        System.out.println("Não há Bikes cadastradas");
                    }else{
                        MetodosUtilitarios.deletarUmaBike(arrayDeBikes);
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
