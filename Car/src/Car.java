public class Car {
	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;
	
	public Car() {
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindres() {
		return cilindres;
	}
	public void setCilindres(int cilindres) {
		this.cilindres = cilindres;
	}
	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}
	public void setPotenciaFiscal() {
		this.potenciaFiscal = 0.08 * this.getCilindres() * Math.pow(this.getCilindrada()/this.getCilindres(), 0.6);;
	}
}
