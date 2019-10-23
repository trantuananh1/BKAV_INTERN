package com.bkav.Bai2;

public abstract class Charater {
	private IWeaponBehavior weaponBehavior;
	
	public Charater(IWeaponBehavior weaponBehavior) {
		this.weaponBehavior=weaponBehavior;
	}
	public void applyWeapon() {
		weaponBehavior.useWeapon();
	}
	public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
		this.weaponBehavior=weaponBehavior;
	}
}
