package com.bkav.Bai1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFilterInputStream extends FilterInputStream {

	protected MyFilterInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read() throws IOException {
		char ch= (char) super.read();
		ch=Character.toLowerCase(ch);
		return ch;
	}

}
