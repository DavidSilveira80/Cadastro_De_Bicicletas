import java.time.LocalDate;

public class Bicicleta {
    Integer id;

    String modelo;
    int aro;
    String cor;
    String nomeDoComprador;
    String nomeDaLoja;
    double preco;
    LocalDate dataDeCompra;

    public Bicicleta(String modelo, int aro, String cor, double preco, String nomeDoComprador, String nomeDaLoja, LocalDate
            dataDeCompra){

        this.id = geradorId.contador();
        this.modelo = modelo;
        this.aro = aro;
        this.cor = cor;
        this.preco = preco;
        this.nomeDoComprador = nomeDoComprador;
        this.nomeDaLoja = nomeDaLoja;
        this.dataDeCompra = dataDeCompra;
    }

}
