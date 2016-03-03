package ru.spb.herzen.ivt3;


public class MsgThread extends Thread {
    public void run(){
        System.out.println("MsgThread started");
        while(true){
            System.out.println("MsgThread iteration");
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                break;
            }
        }
    }
}
