import menus.Menus;
import java.util.Scanner;
public class Aplicacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int option;
        do{
            Menus.menuPrincipal();
            System.out.print("Informe sua escolha: ");
            option = entrada.nextInt();
        }while(option != 1 && option != 2 && option != 3 &&
        option != 4 && option != 5 && option != 6 && option !=7);

    }
}
