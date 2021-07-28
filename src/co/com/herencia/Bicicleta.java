package co.com.herencia;

public class Bicicleta {
	
	private String marca;
	private String color;
	private double velocidad;
	private String pedales;
	
	public Bicicleta() {
		this.marca = "GW";
		this.color = "Gris";
		this.velocidad = 0;
		this.pedales = "Shimano";
	}
	
	public Bicicleta (String marca, String color, double velocidadInicial) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidadInicial;
	}
	
	public Bicicleta (String marca, String color, double velocidad, String pedales) {
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
		this.pedales = pedales;
	}
	
	public void pedalear (double aceleracion) {
		this.velocidad = this.velocidad + aceleracion;
	}
	
	public void frenar () {
		if(this.velocidad>0) {
			this.velocidad--;
		}
	}
	
	public void frenar(double aceleracionNegativa){
		if(this.velocidad> aceleracionNegativa){
			this.velocidad = this.velocidad -aceleracionNegativa;
		}
	}
	
	public void frenar (String intensidad) {
		if(intensidad.equals("fuerte")) {
			if(this.velocidad>10) {
				this.velocidad = this.velocidad - 10;
			}
		} else {
			if(this.velocidad > 0) {
				this.velocidad--;
			}
		}
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public String getPedales() {
		return pedales;
	}
	public void setPedales(String pedales) {
		this.pedales = pedales;
	}
	
	

}
