package model;

public class datos {
	
	private double intervaloX;
	private double intervaloY;
	private int frecuenciaSimple;
	
	
	public datos() {
		super();
	}


	public datos(double intervaloX, double intervaloY, int frecuenciaSimple) {
		super();
		this.intervaloX = intervaloX;
		this.intervaloY = intervaloY;
		this.frecuenciaSimple = frecuenciaSimple;
	}


	public double getIntervaloX() {
		return intervaloX;
	}


	public void setIntervaloX(double intervaloX) {
		this.intervaloX = intervaloX;
	}


	public double getIntervaloY() {
		return intervaloY;
	}


	public void setIntervaloY(double intervaloY) {
		this.intervaloY = intervaloY;
	}


	public int getFrecuenciaSimple() {
		return frecuenciaSimple;
	}


	public void setFrecuenciaSimple(int frecuenciaSimple) {
		this.frecuenciaSimple = frecuenciaSimple;
	}


	@Override
	public String toString() {
		return "datos [intervaloX=" + intervaloX + ", intervaloY=" + intervaloY + ", frecuenciaSimple="
				+ frecuenciaSimple + "]";
	}
	
	

}
