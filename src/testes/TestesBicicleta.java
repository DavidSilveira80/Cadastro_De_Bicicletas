package testes;
import DAO.BicicletaDAO;
import conexaojdbc.SingleConnection;
import models.Bicicleta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import utils.MetodosUtilitarios;

import java.text.ParseException;
import java.util.Date;

public class TestesBicicleta {
    @Test
    void testeIncrementadorDoId(){
        Assertions.assertEquals(1, MetodosUtilitarios.incremento());
        Assertions.assertEquals(2, MetodosUtilitarios.incremento());
    }
    @Test
    public void initBanco(){
        SingleConnection.getConnection();
    }

    @Test
    public void initInserir() throws ParseException {
        BicicletaDAO bicicletaDAO = new BicicletaDAO();
        Bicicleta bike = new Bicicleta();
        bike.setModelo("Mornak");
        bike.setCor("vermelho");
        bike.setNomeDoComprador("David");
        bike.setPreco(350.00);
        bike.setNomeDaLoja("Obino");
        bicicletaDAO.salvar(bike);

    }
}
