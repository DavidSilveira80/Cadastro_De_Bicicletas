package models;

import utils.Metodos;

import java.time.LocalDate;
import java.util.Date;

public class Bicicleta {
    Integer id;

    String modelo;
    String cor;
    String nomeDoComprador;
    String nomeDaLoja;
    double preco;
    Date dataDeCompra;

    public Bicicleta(String modelo, String cor, double preco, String nomeDoComprador, String nomeDaLoja, Date
            dataDeCompra){

        this.id = Metodos.incremento();
        this.modelo = modelo;
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

    public Date getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(Date dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    @Override
    public String toString() {
        return "models.Bicicleta{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", nomeDoComprador='" + nomeDoComprador + '\'' +
                ", nomeDaLoja='" + nomeDaLoja + '\'' +
                ", preco=" + preco +
                ", dataDeCompra=" + dataDeCompra +
                '}';
    }
}
