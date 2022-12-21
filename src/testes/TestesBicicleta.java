package testes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestesBicicleta {
    @Test
    void testeIncrementadorDoId(){
        Assertions.assertEquals(1, utils.Metodos.incremento());
        Assertions.assertEquals(2,utils.Metodos.incremento());
    }
}
