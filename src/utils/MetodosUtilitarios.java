package utils;

import DAO.BicicletaDAO;
import menus.Menus;
import models.Bicicleta;
import java.util.List;
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
                System.out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
                System.out.print("INFORME SUA ESCOLHA: ");
            }
        }
        return numero;
    }
    public static void cadastrarBike(){
        Bicicleta bike = new Bicicleta();
        BicicletaDAO dao = new BicicletaDAO();
        bike.setModelo(EntradasCriarBike.informarModeloBike());
        bike.setCor(EntradasCriarBike.informarCorBike());
        bike.setPreco(EntradasCriarBike.informarPrecoBike());
        bike.setNomeDoComprador(EntradasCriarBike.informarNomeComprador());
        bike.setNomeDaLoja(EntradasCriarBike.informarNomeLoja());
        dao.salvar(bike);
        System.out.println("BIKE CADASTRADA COM SUCESSO.");
    }
    public static void listarBikes(){
        BicicletaDAO dao = new BicicletaDAO();

        try{
            List<Bicicleta> bikes = dao.listar();
            if(bikes.isEmpty()){
                System.out.println("NÃO HÁ BIKES CADASTRADAS NO SISTEMA");
            }else{
                for(Bicicleta bike : bikes) {
                    System.out.println(bike.listarAtributosBike());
                    System.out.println("-----------------------");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void listarBikePorId() throws Exception {
        BicicletaDAO dao = new BicicletaDAO();
        System.out.print("INFORME O ID DA BIKE: ");
        int id = entradaInteira();
        Bicicleta bikeRetornada = dao.buscar(id);
        if(bikeRetornada.getId() == null){
            System.out.println("BIKE NÃO CADASTRADA NO SISTEMA");
            System.out.println();
        }else{
            System.out.println(bikeRetornada.listarAtributosBike());
        }
    }

    public static void atualizarBike() throws Exception {
        System.out.print("INFORME O ID DA BIKE QUE VOCÊ QUER ATUALIZAR: ");
        int id = entradaInteira();
        int opcaoAtualizar;
            do {
                Menus.menuAtualizaUmAtributo();
                System.out.print("INFORME SUA ESCOLHA: ");
                opcaoAtualizar = entradaInteira();

            } while (opcaoAtualizar != 1 && opcaoAtualizar != 2 && opcaoAtualizar != 3
                    && opcaoAtualizar != 4 && opcaoAtualizar != 5 && opcaoAtualizar != 6);
            BicicletaDAO dao = new BicicletaDAO();
            Bicicleta bike;
        switch (opcaoAtualizar) {
                case 1:
                    System.out.println("ATUALIZAR MODELO");
                    bike = dao.buscar(id);
                    bike.setModelo(EntradasCriarBike.informarModeloBike());
                    dao.atualizar(bike, 1);
                    break;
                case 2:
                    System.out.println("ATUALIZAR COR");
                    bike = dao.buscar(id);
                    bike.setCor(EntradasCriarBike.informarCorBike());
                    dao.atualizar(bike, 2);
                    break;
                case 3:
                    System.out.println("ATUALIZAR PREÇO");
                    bike = dao.buscar(id);
                    bike.setPreco(EntradasCriarBike.informarPrecoBike());
                    dao.atualizar(bike, 3);
                    break;
                case 4:
                    System.out.println("ATUALIZAR NOME DO COMPRADOR");
                    bike = dao.buscar(id);
                    bike.setNomeDoComprador(EntradasCriarBike.informarNomeComprador());
                    dao.atualizar(bike, 4);
                    break;
                case 5:
                    System.out.println("ATUALIZAR LOJA");
                    bike = dao.buscar(id);
                    bike.setNomeDaLoja(EntradasCriarBike.informarNomeLoja());
                    dao.atualizar(bike, 5);
                    break;
                case 6:
                    System.out.println("VOLTANDO AO MENU PRINCIPAL");
                    break;
            }
    }

    public static void deletarUmaBike() throws Exception {
        System.out.print("INFORME O ID DA BIKE QUE VOCÊ QUER REMOVER: ");
        int id = MetodosUtilitarios.entradaInteira();
        BicicletaDAO dao = new BicicletaDAO();
        Bicicleta bikeRetornada = dao.buscar(id);
        if(bikeRetornada.getId() == null){
            System.out.println("BIKE NÃO CADASTRADA NO SISTEMA");
            System.out.println();
        }else{
            dao.deletar(id);
            System.out.println("BIKE DELETADA COM SUCESSO");
        }
    }
}
