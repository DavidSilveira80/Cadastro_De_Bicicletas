import menus.Menus;
import utils.MetodosUtilitarios;

//TODO LIMPAR CÓDIGO
//TODO IMPLEMENTAR PERSISTÊNCIA DE DADOS
public class Aplicacao {
    public static void main(String[] args) throws Exception {

        int parada = 0;
        while(parada == 0) {
            int option;
            do {
                Menus.menuPrincipal();
                System.out.print("INFORME A SUA ESCOLHA: ");
                option = MetodosUtilitarios.entradaInteira();

                if (option == 1) {
                    System.out.println("CRIAR BIKE");
                    System.out.println();
                    MetodosUtilitarios.cadastrarBike();

                } else if (option == 2) {
                    System.out.println("LISTAR TODAS AS BIKES");
                    System.out.println();
                    MetodosUtilitarios.listarBikes();

                } else if (option == 3) {
                    System.out.println("LISTAR UMA BIKE POR ID");
                    System.out.println();
                    MetodosUtilitarios.listarBikePorId();

                } else if (option == 4) {
                    System.out.println("ATUALIZAR BIKE");
                    System.out.println();
                    MetodosUtilitarios.atualizarBike();

                } else if (option == 5) {
                    System.out.println("A DEFINIR");
                    break;
                } else if (option == 6) {
                    System.out.println("DELETAR UMA BIKE");
                    System.out.println();
                    MetodosUtilitarios.deletarUmaBike();
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
