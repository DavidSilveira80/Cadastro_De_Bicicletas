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
    public static boolean existeIdBike(ArrayList<Bicicleta> arrayBikes, int id){
        boolean resposta = false;

        for(Bicicleta bike : arrayBikes){
            if(bike.getId().equals(id)){
                resposta = true;
            }else{
                resposta = false;
            }
        }
        return resposta;
    }

    public static void listarBikePorid(ArrayList<Bicicleta> arrayBikes, int id){
        if(existeIdBike(arrayBikes, id) == true){
            for(Bicicleta bike : arrayBikes){
                if(bike.getId().equals(id)){
                    bike.listarAtributosBike();
                }else{
                    System.out.println("Bike não existe.");
                }
            }
        }

    }

}
