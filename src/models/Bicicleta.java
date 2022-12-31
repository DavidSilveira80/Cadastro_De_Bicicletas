package models;

import utils.MetodosUtilitarios;

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

        this.id = MetodosUtilitarios.incremento();
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

    public void listarAtributosBike(){
        System.out.println("============================");
        System.out.println("       Bike -> " + getId());
        System.out.println(" Modelo: " + getModelo());
        System.out.println(" Cor: " + getCor());
        System.out.println(" Preço: " + getPreco());
        System.out.println(" Comprador: " + getNomeDoComprador());
        System.out.println(" Loja: " + getNomeDaLoja());
        System.out.println(" Data da compra: " + getDataDeCompra());
    }
    public void atualizarDadosBike(){

    }
}
