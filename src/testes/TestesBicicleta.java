package testes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import utils.MetodosUtilitarios;

public class TestesBicicleta {
    @Test
    void testeIncrementadorDoId(){
        Assertions.assertEquals(1, MetodosUtilitarios.incremento());
        Assertions.assertEquals(2, MetodosUtilitarios.incremento());
    }
}
