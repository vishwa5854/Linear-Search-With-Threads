package com.vishwa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Data.startTime = System.nanoTime();
        System.out.println("Enter number of elements : ");
        Scanner scanner = new Scanner(System.in);
        Data.numberOfValues = scanner.nextInt();
        System.out.println("Enter the values : ");
        for(int i=0;i<Data.numberOfValues;i++){
            Data.data.add(scanner.nextInt());
        }
        System.out.print("Enter the target value to be searched : ");
        Data.target = scanner.nextInt();
        for(int i=0;i<Data.numberOfValues / 100;i++){
            Slave slave = new Slave(Data.count);
            slave.start();
            Data.count += 100;
        }

    }
}
