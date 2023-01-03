package utils;

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
        for (Bicicleta bike : arrayBikes) {
            if(bike.getId() != id){
                resposta = "Bike não consta no cadastro.";
            }else{
                resposta = bike.listarAtributosBike();
                }
            }
        return resposta;
    }
    public static void atualizarInfoDeUmaBike(ArrayList<Bicicleta> arrayBikes) {
        System.out.print("Informe o ID da bike que você quer atualizar: ");
        int id = entradaInteira();
        for (Bicicleta bike : arrayBikes) {
            if (bike.getId() != id) {
                System.out.println("Bike não consta no cadastro");
            } else {
                bike.atualizarDadosBike();
            }
        }
    }
    public static void deletarUmaBike(ArrayList<Bicicleta> arrayBikes){
        System.out.print("Informe o ID da bike que você quer remover: ");
        int id = MetodosUtilitarios.entradaInteira();
        int cont = 0;
        for(Bicicleta bike : arrayBikes){
            if(bike.getId() != id){
                cont += 1;
            }
            if(cont != 0){
                System.out.println("Bike não consta no cadastro");
            }else if(bike.getId().equals(id)){
                arrayBikes.remove(bike);
                break;
            }
        }
    }
}
