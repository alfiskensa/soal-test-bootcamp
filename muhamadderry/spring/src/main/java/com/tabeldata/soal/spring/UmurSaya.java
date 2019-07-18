package com.tabeldata.soal.spring;

import org.springframework.stereotype.Component;

@Component
public class UmurSaya {

	public java.lang.Integer umur = 20;
	
	public void Umur(Integer umur){
		this.umur = umur;
	}

	public java.lang.Integer getUmur() {
		return umur;
	}

	
	
}
