package com.tabeldata.soal.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tabeldata.soal.spring.PanggilUmur;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	
	
    public static void main( String[] args )
    {
    	ApplicationContext APC = SpringApplication.run(App.class, args);
        PanggilUmur umur = APC.getBean(PanggilUmur.class);
        umur.PanggilUmur();
    }
}
