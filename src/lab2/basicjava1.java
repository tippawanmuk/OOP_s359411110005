package lab2;

public class basicjava1
{
    public static void main(String[] args) {
        //variables
        // integer -
        int x;
        x=10;
        System.out.println(x);
        int y = -100;
        System.out.println(y);
int z = x+y; // z=?
        System.out.println(z);
        //floating-
        // float ,double
        float n = 10.10f;
        System.out.println(n);
        double d =50.55;
        System.out.println(d);
        System.out.println(n*d);

        //character
        char c='#';
        System.out.println(c);

        //String
        String s ="tippawan Sisuay";
        System.out.println(s);
        int count = s.length();
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        //concatenation String
        String myAddress ="@SAIYAI ";
        String msg = s+" "+ myAddress; //msg= ?

        System.out.println(msg);
    System.out.println(s.concat(" "+(myAddress)));

    //Boolean
        boolean b=true;
        boolean r=false;
        System.out.println(b+" "+r);

    }//main




}//class
