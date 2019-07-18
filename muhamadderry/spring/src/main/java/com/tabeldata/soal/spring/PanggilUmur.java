package com.tabeldata.soal.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tabeldata.soal.spring.UmurSaya;;

@Component
public class PanggilUmur {

	@Autowired
    UmurSaya umur;
    
    public void PanggilUmur() {
        System.out.println("saya berusia ("+umur.getUmur()+ ") tahun");
    }




    
}
