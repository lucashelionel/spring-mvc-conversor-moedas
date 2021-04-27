package br.com.unipe.projeto.model;

public class Moedas {
	
	private double euro;
	private double iene;
	private double cotacao_euro = 131.1079;
	private double cotacao_iene = 0.0076;
	
	public Moedas() {}
	
	public Moedas(double euro, double iene, double cotacao_euro, double cotacao_iene) {
		super();
		this.euro = euro;
		this.iene = iene;
		this.cotacao_euro = cotacao_euro;
		this.cotacao_iene = cotacao_iene;
	}
	
	public double getEuro() {
		return euro;
	}
	
	public void setEuro(double euro) {
		this.euro = euro;
	}
	
	public double getIene() {
		return iene;
	}
	
	public void setIene(double iene) {
		this.iene = iene;
	}
	
	public double getCotacao_euro() {
		return cotacao_euro;
	}
	
	public void setCotacao_euro(double cotacao_euro) {
		this.cotacao_euro = cotacao_euro;
	}
	
	public double getCotacao_iene() {
		return cotacao_iene;
	}
	
	public void setCotacao_iene(double cotacao_iene) {
		this.cotacao_iene = cotacao_iene;
	}
		
}
