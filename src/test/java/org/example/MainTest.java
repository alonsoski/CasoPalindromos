package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.*;

public class MainTest {
    @Test
    public void esPalindromoTest(){
        String[] stringIngresados={"anita lava la tina", "adaa", "", "asdSa", "asd1aa"};
        boolean[] esperados={false, false, true, false, false};
        for (int i = 0; i <stringIngresados.length ; i++) {
            Assertions.assertEquals(esPalindromo(stringIngresados[i]),esperados[i]);
        }
    }
}
