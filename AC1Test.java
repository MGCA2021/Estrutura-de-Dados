package AtividadeContinua;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AC1Test {
    @Test
	public void arrayTest() {
		AC1 a = new AC1();
		//testar se o maior é 940
        assertEquals("O Maior Numero 940", 940, a.maior());

		//testar se o menor é 510
        assertEquals("O menor deve ser 510", 510, a.menor());

		//testar se a soma é 7540
        assertEquals("A soma é 7540", 7540, a.soma());
		
		//testar a quantidade de vezes que o numero 3 aparece
        assertEquals("3 aparece 0 vezes", 0, a.repeticoes(3));

		//testar a quantidade de vezes que o numero 790 aparece
        assertEquals("790 aparece 1 vez", 1, a.repeticoes(790));

		//testar a quantidade de vezes que o numero 940 aparece
        assertEquals("940 aparece 2 vezes", 2, a.repeticoes(940));
    }
    
}
