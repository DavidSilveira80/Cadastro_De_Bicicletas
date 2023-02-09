import menus.Menus;
import static java.lang.System.out;
import static utils.MetodosUtilitarios.entradaInteira;
import static utils.MetodosUtilitarios.cadastrarBike;
import static utils.MetodosUtilitarios.listarBikes;
import static utils.MetodosUtilitarios.listarBikePorId;
import static utils.MetodosUtilitarios.atualizarBike;
import static utils.MetodosUtilitarios.deletarUmaBike;


//TODO LIMPAR CÓDIGO

public class Aplicacao {
    public static void main(String[] args) throws Exception {

        int parada = 0;
        while(parada == 0) {
            int option;
            do {
                Menus.menuPrincipal();
                out.print("INFORME A SUA ESCOLHA: ");
                option = entradaInteira();

                if (option == 1) {
                    out.println("CRIAR BIKE");
                    out.println();
                    cadastrarBike();

                } else if (option == 2) {
                    out.println("LISTAR TODAS AS BIKES");
                    out.println();
                    listarBikes();

                } else if (option == 3) {
                    out.println("LISTAR UMA BIKE POR ID");
                    out.println();
                    listarBikePorId();

                } else if (option == 4) {
                    out.println("ATUALIZAR BIKE");
                    out.println();
                    atualizarBike();

                } else if (option == 5) {
                    out.println("A DEFINIR");
                    break;
                } else if (option == 6) {
                    out.println("DELETAR UMA BIKE");
                    out.println();
                    deletarUmaBike();
                } else if (option == 7) {
                    out.println("SAIR");
                    out.println("ENCERRANDO");
                    parada = 1;
                }
            }while (option != 1 && option != 2 && option != 3 &&
                    option != 4 && option != 5 && option != 6 && option != 7);
        }
    }
}
