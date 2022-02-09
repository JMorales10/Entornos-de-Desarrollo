package Examen_Entornos;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		float caja = (float) 0.80, precio = 0;
		int opcion, compra;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("0 ACABA");
			System.out.println("1 Introduce unidades compradas:");
			opcion = sc.nextInt();
			
			if (opcion == 1) {
				System.out.println("Cuantas unidades ha comprado: ");
				compra = sc.nextInt();
				
				if( compra > 8) {
					caja = (float) 0.75;
					precio = caja * compra;	
				}
				
				if(compra > 10) {
					caja = (float) 0.50;
					precio = caja * compra;
				}
				
				if (compra < 8) {
					precio = caja * compra;
				}
			}
			
			System.out.println("El precio es: " + precio);
			
		} while (opcion != 0);
		


	}

}
