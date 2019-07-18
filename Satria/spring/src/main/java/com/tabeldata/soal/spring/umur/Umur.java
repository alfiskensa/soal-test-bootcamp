package com.tabeldata.soal.spring.umur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Umur {

    private java.lang.Integer umur;
    
    public Umur(@Value("20")java.lang.Integer umur){
        this.umur = umur;
    }
    
    public java.lang.Integer getUmur(){
        return umur;
    }
}
