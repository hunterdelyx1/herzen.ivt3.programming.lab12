package ru.spb.herzen.ivt3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IntegerThread integerThread = new IntegerThread();
        integerThread.start();
        try {
            integerThread.join();
        } catch (Exception e){

        }
        System.out.println("Sum = " + integerThread.getS());

        MsgThread msgThread = new MsgThread();
        RandomNumThread randomNumThread = new RandomNumThread(msgThread);
        randomNumThread.start();
    }
}
