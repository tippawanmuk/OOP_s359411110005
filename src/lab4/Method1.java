package lab4;

public class Method1 {
    public static  void main (String[]args){
        System. out.println( "Hello from Main method");
        A();
        System. out.println( "Hello from Main method 2");
        A();
        A();
        B("muk");

        //1.
        String myName = C("tippawan","sisuay");
        System.out.println(myName);

//2.
        System.out.println (C ("tippawan","sisuay"));

        //1.
    }
    public static void A(){
        System. out.println( "Hello from A method");
    }
    //2.
    public static void B(String msg) {
        System.out.println("Hello from A method." + msg);
    }
    //3.
    public static String C(String fName,String lname){
        System.out.println("Hello from C method.");
        String myName = fName +""+lname;

        return myName;
    }
}
