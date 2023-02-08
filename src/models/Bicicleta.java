package models;

import java.util.Locale;

public class Bicicleta {
    private Integer id;
    private String modelo;
    private String cor;
    private String nomeDoComprador;
    private String nomeDaLoja;
    private double preco;


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

    public String listarAtributosBike(){
        Locale.setDefault(Locale.US);
        String resp = String.format("============================\n" +
                "BIKE -> %d\n" +
                "Modelo: %s\n" +
                "Cor: %s\n" +
                "Preço: R$ %.2f \n" +
                "Comprador: %s\n" +
                "Loja: %s\n"
                ,getId(), getModelo(),
                getCor(), getPreco(), getNomeDoComprador()
        ,getNomeDaLoja());
        return resp;
    }
}
