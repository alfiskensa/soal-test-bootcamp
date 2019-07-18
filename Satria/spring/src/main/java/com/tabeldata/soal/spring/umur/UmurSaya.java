package com.tabeldata.soal.spring.umur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UmurSaya {

    
    @Autowired
    Umur umur;
    
    public void UmurSaya () {
        System.out.println("saya ber-usia "+umur.getUmur()+ " tahun");
    }
}
