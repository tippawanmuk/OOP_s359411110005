package lab4;

import java.util.Scanner;

public class Method2 {

    public  static void  main (String[]args){
        Scanner sc =new Scanner(System.in);{
            System.out.print ("Enter an number 1:");
            double x = sc.nextDouble();
            System.out.print ("Enter an number 2:");
            double y = sc.nextDouble();

            double z= plus(x,y);
            System.out.println((x+"+"+y+"="+z));

            double A= minus(x,y);
            System.out.println((x+"*"+y+"="+A));

            double B= times(x,y);
            System.out.println((x+"/"+y+"="+B));


        }

    }

    private static double times(double x, double y) {
        return x/y;
    }

    private static double minus(double x, double y) {
        return x*y;
    }

    private static double plus(double x, double y) {
        return x=y;

    }

}
