package com.tabeldata.soal.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tabeldata.soal.spring.model.UmurSaya;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ApplicationContext ap = SpringApplication.run(Application.class, args);
	UmurSaya umur = ap.getBean(UmurSaya.class);
	umur.UmurSaya();
	}

}
