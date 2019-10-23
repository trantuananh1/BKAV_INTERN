package com.bkav.Bai1;

public class Operator {
	private int soMu;
	private double heSo;
	
	public Operator() {
		
	}
	public Operator(double heSo, int soMu) {
		// TODO Auto-generated constructor stub
		this.heSo=heSo;
		this.soMu=soMu;
	}
	public void print() {
		System.out.print(heSo+"x^"+soMu);
	}
	
	public int getSoMu() {
		return soMu;
	}
	public void setSoMu(int soMu) {
		this.soMu = soMu;
	}
	public double getHeSo() {
		return heSo;
	}
	public void setHeSo(double heSo) {
		this.heSo = heSo;
	}
	
}
