package clases;

import java.util.Scanner;

public abstract class clasePadre {

	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in); //para poner datos desde teclado
	
	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;     //variables LOCALES
		
		do{ 
			System.out.println("Por favor seleccione una opcion");
			System.out.println("     1.Consulta de saldo");
			System.out.println("     2.Retiro de efectivo");
			System.out.println("     3.Deposito de efectivo");
			System.out.println("     4.Salir.");
			seleccion= entrada.nextInt();
			
			if (seleccion >=1 && seleccion <=4) {
				bandera=1;
			}else {
				System.out.println("Opcion no disponible, vuelta a intentar por favor.");
			}
		}while (bandera==0);
		
		if(seleccion == 1) {
			
			clasePadre mensajero = new claseHija_consulta(); //clase padre, comunicate con clase hija y ejecuta el metodo transacciones
			mensajero.Transacciones();
		}else if (seleccion ==2) {
			
			clasePadre mensajero = new claseHija_Retiro(); 
			mensajero.Transacciones();
			
			
		}else if (seleccion ==3) {
			
			clasePadre mensajero = new claseHija_Deposito(); 
			mensajero.Transacciones();
			
		}else if (seleccion ==4) {
			
			System.out.println("Gracias, vuelva pronto.");
			bandera =2;
		
		
	} while (bandera !=2);
		
		
	} 
	
	//metodo para solicitar cantidad de retiro
	
	public void Retiro() {
		
		retiro = entrada.nextInt();
		
	}
	
	//metodo para solicitar deposito
	
	public void Deposito() {
		
		deposito = entrada.nextInt();
		
	}
	
	public abstract void Transacciones();

	public static int getSaldo() {
		return saldo;
	}

	public static void setSaldo(int saldo) {
		clasePadre.saldo = saldo;
	}
	
	
	
}
