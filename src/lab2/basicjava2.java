package lab2;

import java.util.Scanner;

public class basicjava2 {

    public static  void main (String [] args){
        //input data from keyboard

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("your name is "+name);

        System.out.print("Enter your tel:");
        String tel = sc.nextLine();
        System.out.println("your tel is "+tel);

        System.out.print("Enter your email:");
        String email = sc.nextLine();
        System.out.println("your tel is "+email);

    }//main
}
