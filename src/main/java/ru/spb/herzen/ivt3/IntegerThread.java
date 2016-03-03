package ru.spb.herzen.ivt3;


import java.util.ArrayList;

public class IntegerThread extends Thread {
    private Integer s = 0;

    public void run(){
        for(Integer i=0; i<101; i++){
            s+=i;
        }
    }

    public Integer getS(){
        return s;
    }
}
