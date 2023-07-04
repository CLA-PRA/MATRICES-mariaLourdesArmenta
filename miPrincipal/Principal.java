package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        
		Matriz m1 = new Matriz("miPrincipal/m1.mat");
		
		Matriz m2 = new Matriz("miPrincipal/m2.mat");
		System.out.println("==========================================");
		System.out.println("Operaciones con Matrices (sumar y restar )");
		System.out.println("==========================================");
		System.out.println("Matriz de Entrada 1:");
		
		m1.leer();
		System.out.println("Matriz de Entrada 2:");
		m2.leer();
		System.out.println("               Resultados                 ");
		
		if (m1.validaSuma(m2))
		   m1.suma(m2);
		else
			System.out.println("No es posible efectuar la suma");
		if (m1.validaMultiplica(m2))
			   m1.multiplica(m2);
			else
				System.out.println("No es posible efectuar la multiplicacion");
    }

}