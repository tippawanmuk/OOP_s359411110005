package lab2;

import java.util.Scanner;

public class Exercise_lab2 {
    public static  void  main (String[]args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight:");
        double w = sc.nextDouble();
        System.out.print("Enter your height(meter):");
        double h = sc.nextDouble();

        //step2: calculate
        double bmi = w / (h * h);

        //step3: print result
        System.out.print(" your BMI:"+bmi);

}}
