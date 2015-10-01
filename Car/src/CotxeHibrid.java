
public class CotxeHibrid extends Car {
	int kW;

	public int getkW() {
		return kW;
	}

	public void setkW(int kW) {
		this.kW = kW;
	}
	
	public void setPotenciaFiscal() {
		potenciaFiscal = 0.08 * this.getCilindres() * Math.pow(this.getCilindrada()/this.getCilindres(), 0.6) * (this.kW/200.0);
	}
}
