package com.bkav.Bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File data=new File("D:\\Data.txt");
		FileInputStream file=new FileInputStream(data);
		MyFilterInputStream input
			=new MyFilterInputStream(file);
		int k=0;
		while ((k=input.read())!=1) {
			System.out.print((char)k);
		}
		file.close();
		input.close();
		
	}
}
