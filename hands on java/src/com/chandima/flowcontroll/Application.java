package com.chandima.flowcontroll;

import java.util.Scanner;

public class Application {
    public  static  void main (String args[]){
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        if (name.equals("chandima")){
            System.out.println("Welcome : "+name);
        } else {
            System.out.println("You are not welcome here : "+name);
        }

        int i=0;
        while (i<10){
            System.out.println("i is : " +i);
            i++;
        }


        int x=0;
        do {
            System.out.println("x is : " +x);
            x++;
        }while (x<10);


        for (int j=0;j<10;j++){
            System.out.println("i is : " +j);
        }

    }
}
