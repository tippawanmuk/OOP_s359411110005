package lap8;

public class PersonApp {
    public  static  void  main(String[] args){
        //create objects
        Person P1 =new Person("1111111111111","Tippawan Sisuay","22/07/1995");
        System.out.println(P1.toString());

        Studrnt S1 =new Studrnt("222222222222","Tippawan Sisuay","22/07/1995",
                "005","Information System");

        S1.running();
        S1.addSubjiect();


    }
}
