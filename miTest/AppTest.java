package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Matriz m,m2;
    

    @BeforeAll public static void setUp() throws Exception{

        m = new Matriz("miPrincipal/m1.mat");
        m2 = new Matriz("miPrincipal/m2.mat");
        
    }
    @Test public void testSumaMatriz1(){ 
        int matrizEntrada1[][]={{1, 3},
                               {-1,0}};       
        int matrizEntrada2[][]={{4,5},
                                {-1,0}};

        int matrizEsperada[][]={{5,8},
                               {-2,0}};

        assertArrayEquals(m.suma(m2),matrizEsperada);
        
    }
    @Test public void testMultiplicaMatriz1(){
        int matrizEntrada1[][]={{1, 3},
                               {-1,0}};       
        int matrizEntrada2[][]={{4,5},
                                {-1,0}};

        int matrizEsperada[][]={{1,5},
                                {-4,-5}};
        assertArrayEquals(m.multiplica(m2),matrizEsperada);
    }
    
    @Test public void TestMatValidaSumV(){
        assertTrue(m.validaSuma(m2));
    }
    
    @Test public void TestMatValidaMulV(){
        assertTrue(m.validaMultiplica(m2));
    }
    

    @Test public void TestMatricesSalida(){
        
    }
    
}