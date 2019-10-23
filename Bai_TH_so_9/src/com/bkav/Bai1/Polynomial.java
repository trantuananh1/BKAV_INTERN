package com.bkav.Bai1;

import java.util.LinkedList;

public class Polynomial {
	LinkedList<Operator> linkedList=new LinkedList<>();
	
	public Polynomial() {
		// TODO Auto-generated constructor stub
		//linkedList=null;
	}
	public Polynomial(Operator ope) {
		linkedList.add(ope);
	}
	
	public void add(Operator obj) {
		if (obj.getHeSo()==0) {
			return;
		}
		linkedList.add(obj);
	}
	public void congHangTu(Operator ope) {
		for (Operator item : linkedList) {
			if (item.getSoMu()==ope.getSoMu()) {
				item.setHeSo(item.getHeSo()+ope.getHeSo());
				return;
			}
		}
		linkedList.add(ope);
	}
	public void nhanHangTu(Operator ope) {
		for (Operator item : linkedList) {
			item.setHeSo(item.getHeSo()*ope.getHeSo());
			item.setSoMu(item.getSoMu()+ope.getSoMu());
		}
	}
	public void congDaThuc(Polynomial poly) { 
		
		for (Operator item1 : linkedList) {
			for (Operator item2 : poly.linkedList) {
				if (item1.getSoMu()==item2.getSoMu()) {
					item1.setHeSo(item1.getHeSo()+item2.getHeSo());
				}else {
					linkedList.add(item2);
				}
			}
		}
		
	}
	public void print() {
		for (int i=0; i<linkedList.size(); i++) {
			if (linkedList.get(i).getHeSo()>0) {
				System.out.print("+");
			}
			linkedList.get(i).print();
			//System.out.print("  ");
		}
	}
}
