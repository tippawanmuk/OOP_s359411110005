package lab7;

public class MobileStore {
    public static void main(String[] args) {
        Mobile m2 = new Mobile("Apple","2002","iphone11Pro",35.900,"ios13");

        System.out.println(m2.toString());

        m2.setPrice(22.000);
        System.out.println(m2.toString());
    }

}
