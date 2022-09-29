import java.util.Objects;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		
		Scanner entradaDatos = new Scanner (System.in);
		boolean salir = false;
		int opcion = 0;
				
		do {			
			System.out.println("*********************************");
			System.out.println("  Calculadora de Calculator S.A  ");
			System.out.println("*********************************");
			System.out.print("\n");
			System.out.println("-----------------------------");
			System.out.println("--       Opciones          --");
			System.out.println("-----------------------------");
			System.out.print("\n");
			System.out.println("\t1. Sumar");
			System.out.println("\t2. Restar");
			System.out.println("\t3. Multiplicar");
			System.out.println("\t4. Dividir");
			System.out.println("\t5. Número mayor de 3 números");
			System.out.println("\t6. Capiúa");
			System.out.print("\n");
			System.out.println("\t0. Salir");
			System.out.print("\n");
			System.out.print("Introduzca una opción: ");
						
			opcion = entradaDatos.nextInt();
			
			if (opcion>6 || opcion<0) {
				System.out.print("\n");
				System.out.println("--------------------------------------------");
				System.out.println("Opción errónea");
				System.out.println("--------------------------------------------");
				System.out.print("\n");
			} else {
				switch (opcion) {
				case 1:
					float sum1 = 0;
					float sum2 = 0;
					float resum = 0;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a sumar: ");
					sum1 = entradaDatos.nextFloat();
					System.out.print("Introduzca el segundo número flotante a sumar: ");
					sum2 = entradaDatos.nextFloat();
					resum = sum1 + sum2;
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La suma de "+sum1+" y "+sum2+" es: "+resum);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					break;
				
				case 2:
					float rest1 = 0;
					float rest2 = 0;
					float resta = 0;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a restar: ");
					rest1 = entradaDatos.nextFloat();
					System.out.print("Introduzca el segundo número flotante a restar: ");
					rest2 = entradaDatos.nextFloat();
					resta = rest1 - rest2;
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La resta de "+rest1+" y "+rest2+" es: "+resta);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					break;
				
				case 3:
					float mult1 = 0;
					float mult2 = 0;
					float resmult = 0;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a multiplicar: ");
					mult1 = entradaDatos.nextFloat();
					System.out.print("Introduzca el segundo número flotante a multiplicar: ");
					mult2 = entradaDatos.nextFloat();
					resmult = mult1 * mult2;
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("La multiplicación de "+mult1+" y "+mult2+" es: "+resmult);
					System.out.println("--------------------------------------------");
					System.out.print("\n");
					break;
				
				case 4:
					float div1 = 0;
					float div2 = 0;
					float resdiv = 0;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante a dividir: ");
					div1 = entradaDatos.nextFloat();
					System.out.print("Introduzca el segundo número flotante a dividir: ");
					div2 = entradaDatos.nextFloat();
					if (div2==0) {
						System.out.println("Error division por 0");
					} else {
						resdiv = div1 / div2;
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println("La división de "+div1+" y "+div2+" es: "+resdiv);
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					}
					break;
					
				case 5:
					float num1 = 0;
					float num2 = 0;
					float num3 = 0;
					
					System.out.print("\n");
					System.out.print("Introduzca el primer número flotante de los 3: ");
					num1 = entradaDatos.nextFloat();
					System.out.print("Introduzca el segundo número flotante de los 3: ");
					num2 = entradaDatos.nextFloat();
					System.out.print("Introduzca el tercer número flotante de los 3: ");				
					num3 = entradaDatos.nextFloat();
					
					if (num1 > num2 && num1 > num3) {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println("EL número "+num1+" es el mayor de los 3 números");
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					} else if (num2 > num1 && num2 > num3) {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println("EL número "+num2+" es el mayor de los 3 números");
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					} else if (num3 > num1 && num3 > num2) {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println("EL número "+num3+" es el mayor de los 3 números");
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					}					
					break;
					
				case 6:
					String input = "";
					String aux = "";
					boolean resultado = false;
					
					entradaDatos = new Scanner(System.in);
					System.out.print("\n");
					System.out.print("Introduzca un número para saber si es capicúa: ");
					input = entradaDatos.next();
						
					StringBuilder output = new StringBuilder(input).reverse();
					aux = output.toString();
									
					resultado = Objects.equals(input, aux);
					
					if (resultado==true) {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println(input+" SI es capicua");
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					} else {
						System.out.print("\n");
						System.out.println("--------------------------------------------");
						System.out.println(input+" NO es capicua");
						System.out.println("--------------------------------------------");
						System.out.print("\n");
					}
					break;
					
				case 0:	
					System.out.print("\n");
					System.out.println("--------------------------------------------");
					System.out.println("El programa ha finalizado");
					System.out.println("--------------------------------------------");
					salir = true;
				}
			}
		}
		
		while (!salir);
		
		entradaDatos.close();
	}
}
		 

	


