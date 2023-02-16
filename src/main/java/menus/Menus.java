package menus;

import static java.lang.System.out;

public class Menus {
    public static void menuPrincipal(){
        out.println("===============================================================");
        out.println("    1  ->   CADASTRAR BIKE                                     ");
        out.println("    2  ->   LISTAR TODAS AS BIKES                              ");
        out.println("    3  ->   LISTAR UMA BIKE POR ID                             ");
        out.println("    4  ->   ATUALIZAR BIKE                                     ");
        out.println("    5  ->   A DEFINIR                                          ");
        out.println("    6  ->   DELETAR UMA BIKE                                   ");
        out.println("    7  ->   SAIR                                               ");

    }
    public static void menuAtualizaUmAtributo(){
        out.println("========================================");
        out.println("  1 -> ATUALIZAR MODELO                 ");
        out.println("  2 -> ATUALIZAR COR                    ");
        out.println("  3 -> ATUALIZAR PREÇO                  ");
        out.println("  4 -> ATUALIZAR NOME DO COMPRADOR      ");
        out.println("  5 -> ATUALIZAR LOJA                   ");
        out.println("  6 -> VOLTAR AO MENU PRINCIPAL         ");
    }
}
