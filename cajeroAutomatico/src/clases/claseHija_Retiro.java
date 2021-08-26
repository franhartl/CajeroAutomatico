package clases;

public class claseHija_Retiro extends clasePadre {
	@Override
	public void Transacciones() {
		
		System.out.println("Cuanto deaseas retirar: ");
		Retiro();
		if(retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("Retiraste: " + retiro);
			System.out.println("Tu saldo actual es: "+ getSaldo());
			
		}else {
			System.out.println("Saldo insuficiente");
		
		}
		
		
		
	}
	
	

}
