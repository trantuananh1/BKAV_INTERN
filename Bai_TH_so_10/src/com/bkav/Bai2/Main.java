package com.bkav.Bai2;

public class Main {
	public static void main(String[] args) {
	
		King king=new King();
		king.applyWeapon();
		
		king.setWeaponBehavior(new AxeBehavior());
		king.applyWeapon();
	}

}
