package co.com.herencia;

public class PruebaHerencia {

	public static void main(String[] args) {
		
		BicicletaMontania bicicletaM = new BicicletaMontania();
		System.out.println("Mi bicicleta es de marca " + bicicletaM.getMarca());
		System.out.println("Mi bicicleta es de color " + bicicletaM.getColor());
		System.out.println("Mi bicicleta tiene una velocidad" + bicicletaM.getVelocidad());
		System.out.println("Mi bicicleta esta en el cambio " + bicicletaM.getCambio());
		
		bicicletaM.setMarca("Specialized");
		bicicletaM.setColor("Roja");
		
		bicicletaM.subirCambio();
		bicicletaM.subirCambio();
		bicicletaM.subirCambio();
		
		bicicletaM.pedalear(5);
		bicicletaM.pedalear(5);
		
		System.out.println("Mi bicicleta es de marca " + bicicletaM.getMarca());
		System.out.println("Mi bicicleta es de color " + bicicletaM.getColor());
		System.out.println("Mi bicicleta tiene una velocidad" + bicicletaM.getVelocidad());
		System.out.println("Mi bicicleta esta en el cambio " + bicicletaM.getCambio());
		
		
		
		

	}

}
