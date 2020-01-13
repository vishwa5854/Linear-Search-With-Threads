package com.vishwa;

public class Slave extends Thread {

    int count;

    Slave(int c){
        this.count = c;
    }

    @Override
    public void run() {
        for(int i=count+1;i<count+100;i++){
            if(Data.target == Data.data.get(i)){
                System.out.println("Target Found at " + i);
                long endTime = System.nanoTime();
                System.out.println(endTime - Data.startTime);
                System.exit(0);
            }
        }
    }
}
