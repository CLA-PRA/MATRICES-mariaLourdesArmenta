package miPrincipal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Matriz {
	
	int nRenglones;
	int nColumnas;
	int nElementos;
	int matriz[][];
	int matrizResultado[][];
	public Matriz(String archivo) throws Exception{
		
		File file = new File(archivo);
		
		Scanner sc = new Scanner(file);
		StringTokenizer st;
		//Leo la primer linea del archivo
		//que es donde vienen las files y columnas
		String linea = sc.nextLine();
		//parto la linea para separar filar y columnas
		st = new StringTokenizer(linea," ");
		//System.out.println("Encabezado "+linea);
		String sRenglones = (String)st.nextElement();
		String sColumnas = (String)st.nextElement();
		nRenglones =Integer.parseInt(sRenglones);
		nColumnas = Integer.parseInt(sColumnas);
		
		//System.out.println("Renglon "+nRenglones);
		//System.out.println("Columna "+nColumnas);
		
		matriz = new int[nRenglones][nColumnas];
		nElementos = getnElementos();
		
		//Leo las siguiente lineas que tienen
		//los elementos del arreglo
		int i=0;
		while (sc.hasNextLine()){
			linea = sc.nextLine();
			st = new StringTokenizer(linea);
			int j=0;
			while (st.hasMoreTokens()) {
				String cadString = (st.nextToken());
				int cadNumero = Integer.parseInt(cadString);
				//System.out.println("Elemento "+cadNumero);
				matriz[i][j]=cadNumero;
				j++;
			}
			i++;
		}
		sc.close();
	}
	
	
	public int getnRenglones() {
		return nRenglones;
	}
	public void setnRenglones(int nRenglones) {
		this.nRenglones = nRenglones;
	}
	public int getnColumnas() {
		return nColumnas;
	}
	public void setnColumnas(int nColumnas) {
		this.nColumnas = nColumnas;
	}
	public int getnElementos() {
		return getnRenglones()*getnColumnas();
	}
	public void setnElementos(int nElementos) {
		this.nElementos = nElementos;
	}
	public void leer() {
		for (int i=0;i<getnRenglones();i++) {
			for(int j=0;j<getnColumnas();j++)
			{
				System.out.print(" "+matriz[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public int[][] suma(Matriz m1) {
		/*
		 * El número de renglones de la primer matriz (matriz)
		 * y el número columnas de la segunda matriz
		 * tienen que ser iguales 
		 */
		matrizResultado = new int[nRenglones][nColumnas];
		System.out.println("Matriz Resultante Suma:");
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++)
			{
				//Aqui va el codigo que falta
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		return matrizResultado;
		
		
	}
	public int[][] multiplica(Matriz m1) {
		/*
		 * El número de columnas de la primer matriz (matriz)
		 * tiene que ser igual que el número de renglones
		 * de la segunda matriz (m2)
		 */
		int nRenglones = this.getnRenglones();
		int nColumnas = m1.getnColumnas();
		matrizResultado = new int[nRenglones][nColumnas];
		System.out.println("Matriz resultante Multiplica:");
		
		for (int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<m1.matriz[i].length;j++)
			{	
				int suma = 0;
				
				for( int k=0;k<m1.matriz.length;k++)
				{
					//Aqui va el codigo que falta
				}
				System.out.print(suma+" ");
				matrizResultado[i][j]=suma;
				
			}
			System.out.print("\n");
			
		}
		System.out.print("\n");	
		return matrizResultado;
	}
	public boolean validaSuma(Matriz m1) {
		/*
		 * Regresa verdadero cuando ambas matrices
		 * son del mismo orden
		 */
		//Aqui va el codigo que falta para que regrese true
		
		
			return false;
	}
	public boolean validaMultiplica(Matriz m1) {
		/*
		 * Regresa verdadero cuando las columnas de 
		 * la matriz 1 es igual al número de filas de la 
		 * matriz 2
		 */
		//Aqui va el codigo que falta para que regrese true
		
			return false;
	}
}