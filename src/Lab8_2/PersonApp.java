package Lab8_2;

public class PersonApp {
    public static  void  main (String[]){

        Person P1=new Person("tippawan","1995");
        Person P2 =new Police("saw","1998","Nakornsithammarat");
        Person P3=new Sheriff("lek","1998","Pookpoon");


        P1.introduce();
        P2.introduce();
        P3.introduce();
    }
}
