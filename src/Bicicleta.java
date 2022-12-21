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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeDoComprador() {
        return nomeDoComprador;
    }

    public void setNomeDoComprador(String nomeDoComprador) {
        this.nomeDoComprador = nomeDoComprador;
    }

    public String getNomeDaLoja() {
        return nomeDaLoja;
    }

    public void setNomeDaLoja(String nomeDaLoja) {
        this.nomeDaLoja = nomeDaLoja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(LocalDate dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", aro=" + aro +
                ", cor='" + cor + '\'' +
                ", nomeDoComprador='" + nomeDoComprador + '\'' +
                ", nomeDaLoja='" + nomeDaLoja + '\'' +
                ", preco=" + preco +
                ", dataDeCompra=" + dataDeCompra +
                '}';
    }
}
