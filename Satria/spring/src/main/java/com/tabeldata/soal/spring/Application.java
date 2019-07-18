package com.tabeldata.soal.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tabeldata.soal.spring.umur.UmurSaya;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext APC = SpringApplication.run(Application.class, args);
                UmurSaya umur = APC.getBean(UmurSaya.class);
                umur.UmurSaya();
	}

}
