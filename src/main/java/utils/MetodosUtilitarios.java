package utils;

import DAO.BicicletaDAO;
import menus.Menus;
import models.Bicicleta;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.Integer.parseInt;

import static utils.EntradasCriarBike.informarModeloBike;
import static utils.EntradasCriarBike.informarCorBike;
import static utils.EntradasCriarBike.informarNomeComprador;
import static utils.EntradasCriarBike.informarPrecoBike;
import static utils.EntradasCriarBike.informarNomeLoja;

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
                numero = parseInt(entrada.nextLine());
                continuaLeitura = false;
            }catch(NumberFormatException e){
                out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
                out.print("INFORME SUA ESCOLHA: ");
            }
        }
        return numero;
    }

    public static void cadastrarBike(){
        Bicicleta bike = new Bicicleta();
        BicicletaDAO dao = new BicicletaDAO();

        bike.setModelo(informarModeloBike());
        bike.setCor(informarCorBike());
        bike.setPreco(informarPrecoBike());
        bike.setNomeDoComprador(informarNomeComprador());
        bike.setNomeDaLoja(informarNomeLoja());

        dao.salvar(bike);
        out.println("BIKE CADASTRADA COM SUCESSO.");
    }

    public static void listarBikes(){
        BicicletaDAO dao = new BicicletaDAO();

        try{
            List<Bicicleta> bikes = dao.listar();
            if(bikes.isEmpty()){
                out.println("NÃO HÁ BIKES CADASTRADAS NO SISTEMA");
            }else{
                for(Bicicleta bike : bikes) {
                    out.println(bike.listarAtributosBike());
                    out.println("-----------------------");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void listarBikePorId() throws Exception {
        BicicletaDAO dao = new BicicletaDAO();
        out.print("INFORME O ID DA BIKE: ");
        int id = entradaInteira();
        Bicicleta bikeRetornada = dao.buscar(id);
        if(bikeRetornada.getId() == null){
            out.println("BIKE NÃO CADASTRADA NO SISTEMA");
            out.println();
        }else{
            out.println(bikeRetornada.listarAtributosBike());
        }
    }

    public static void atualizarBike() throws Exception {
        out.print("INFORME O ID DA BIKE QUE VOCÊ QUER ATUALIZAR: ");
        int id = entradaInteira();
        int opcaoAtualizar;
            do {
                Menus.menuAtualizaUmAtributo();
                out.print("INFORME SUA ESCOLHA: ");
                opcaoAtualizar = entradaInteira();

            } while (opcaoAtualizar != 1 && opcaoAtualizar != 2 && opcaoAtualizar != 3
                    && opcaoAtualizar != 4 && opcaoAtualizar != 5 && opcaoAtualizar != 6);
            BicicletaDAO dao = new BicicletaDAO();
            Bicicleta bike;
        switch (opcaoAtualizar) {
                case 1:
                    out.println("ATUALIZAR MODELO");
                    bike = dao.buscar(id);
                    bike.setModelo(informarModeloBike());
                    dao.atualizar(bike, 1);
                    break;
                case 2:
                    out.println("ATUALIZAR COR");
                    bike = dao.buscar(id);
                    bike.setCor(informarCorBike());
                    dao.atualizar(bike, 2);
                    break;
                case 3:
                    out.println("ATUALIZAR PREÇO");
                    bike = dao.buscar(id);
                    bike.setPreco(informarPrecoBike());
                    dao.atualizar(bike, 3);
                    break;
                case 4:
                    out.println("ATUALIZAR NOME DO COMPRADOR");
                    bike = dao.buscar(id);
                    bike.setNomeDoComprador(informarNomeComprador());
                    dao.atualizar(bike, 4);
                    break;
                case 5:
                    out.println("ATUALIZAR LOJA");
                    bike = dao.buscar(id);
                    bike.setNomeDaLoja(informarNomeLoja());
                    dao.atualizar(bike, 5);
                    break;
                case 6:
                    out.println("VOLTANDO AO MENU PRINCIPAL");
                    break;
            }
    }

    public static void deletarUmaBike() throws Exception {
        out.print("INFORME O ID DA BIKE QUE VOCÊ QUER REMOVER: ");
        int id = entradaInteira();

        BicicletaDAO dao = new BicicletaDAO();
        Bicicleta bikeRetornada = dao.buscar(id);

        if(bikeRetornada.getId() == null){
            out.println("BIKE NÃO CADASTRADA NO SISTEMA");
            out.println();
        }else{
            dao.deletar(id);
            out.println("BIKE DELETADA COM SUCESSO");
        }
    }
}
