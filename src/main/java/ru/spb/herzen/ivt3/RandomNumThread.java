package ru.spb.herzen.ivt3;

import java.util.Random;

public class RandomNumThread extends Thread {
    MsgThread msgThread;

    int progress;

    public int getProgress(){
        return progress;
    }

    public RandomNumThread(MsgThread msgThread){
        super();
        this.msgThread = msgThread;
        this.msgThread.start();
    }

    public void run(){
        System.out.println("RandomNumThread started");
        Random random = new Random();
        Long randomNumber = Math.abs(random.nextLong()+ 1000000000L) % 1000000000L;

        boolean prime = true;
        for(Long i=2L; i<Math.sqrt(randomNumber) && prime; i++){
            if(randomNumber % i == 0) prime = false;

            try {
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }

        System.out.println("\nRandom number is " + randomNumber);

        if(prime) System.out.println("It's a prime number");
        else System.out.println("It's not a prime number");
        msgThread.interrupt();
    }
}
