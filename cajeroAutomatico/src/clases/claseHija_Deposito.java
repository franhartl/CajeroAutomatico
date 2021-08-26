package clases;

public class claseHija_Deposito extends clasePadre{
	
	@Override
	public void Transacciones() {

		System.out.println("cuanto deseas depositar: ");
		Deposito();
		
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("Depositaste:  " + deposito);
		System.out.println("Tu saldo actual es: " + getSaldo());
		
	}	
}
