import java.util.Scanner;		//SCANNER
public class SumatorioPotencias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		int n = teclado.nextInt();		//ALMACENA NÚMERO EN N
		double suma =0;		//SUMATORIO
		double valor;		//VALOR A SUMAR AL SUMATORIO
		
		for (double i=1;i<=n;i++) {		//BUCLE - REPETIR N VECES
			valor = Math.pow(i, i);		//HALLAR VALOR
			suma = suma + valor;		//ACTUALIZAR SUMATORIO
			
		}
				//OUTPUT
		System.out.printf("El sumatorio de las potencias es %d.",suma);
	}

}
