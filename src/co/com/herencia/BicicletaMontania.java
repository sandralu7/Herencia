package co.com.herencia;

public class BicicletaMontania extends Bicicleta {
	
		private int cambio;
		
		public BicicletaMontania() {
			super();
			this.cambio = 6;
		}
		
		public BicicletaMontania (int cambio, 
				String marca, 
				String color, 
				double velocidadInicial) {
			super(marca, color, velocidadInicial);
			if(cambio>0 && cambio<=12) {
				this.cambio = cambio;
			}else {
				this.cambio = 6;
			}
			
		}
		
		public BicicletaMontania (int cambio, String marca, String color, double velocidadInicial,
				String pedales) {
			super(marca, color, velocidadInicial, pedales);
			if(cambio>0 && cambio<=12) {
				this.cambio = cambio;
			}else {
				this.cambio = 6;
			}
			
		}
		
		public void subirCambio() {
			if (this.cambio < 12) {
				cambio ++;
			}
		}
		
		public void bajarCambio () {
			if (this.cambio>1) {
				cambio --;
			}
		}
		
		public void pedalear (double aceleracion) {
			double aceleracionConCambios = aceleracion * (this.cambio/6);
			super.pedalear(aceleracionConCambios);
			
		}
		

		public int getCambio() {
			return cambio;
		}

		public void setCambio(int cambio) {
			this.cambio = cambio;
		}
		
		

}
