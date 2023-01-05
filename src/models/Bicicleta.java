package models;

import utils.EntradasCriarBike;
import utils.MetodosUtilitarios;
import java.text.*;
import java.util.Date;

public class Bicicleta {
    private Integer id;
    private String modelo;
    private String cor;
    private String nomeDoComprador;
    private String nomeDaLoja;
    private double preco;
    private Date dataDeCompra;

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

    public String listarAtributosBike(){

        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");

        String resp = String.format("============================\n" +
                "BIKE -> %d\n" +
                "Modelo: %s\n" +
                "Cor: %s\n" +
                "Preço: %.2f R$\n" +
                "Comprador: %s\n" +
                "Loja: %s\n" +
                "Data da Compra: %s", getId(), getModelo(),
                getCor(), getPreco(), getNomeDoComprador()
        ,getNomeDaLoja(), sdf1.format(getDataDeCompra()));
        return resp;

    }
    public void atualizarDadosBike(){
        Date dataDeCompra = new Date();
        setModelo(EntradasCriarBike.informarModeloBike());
        setCor(EntradasCriarBike.informarCorBike());
        setPreco(EntradasCriarBike.informarPrecoBike());
        setNomeDoComprador(EntradasCriarBike.informarNomeComprador());
        setNomeDaLoja(EntradasCriarBike.informarNomeLoja());
        setDataDeCompra(dataDeCompra);

    }
}
