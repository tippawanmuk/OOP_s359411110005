package lab4;

public class Aray1 {
    public static void main (String[]args){
        int x[] =new int[5];

        x[0]= 10;
        x[2] = x[0] *2;
        x[3] = x [1]+100*2;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        showArray(x);
        showArrayEach(x);
    }

    private static void showArrayEach(int[] x) {
        System.out.print("Each data in array: ");
        for (int val:x){
            System.out.println(val+" ");
        }
        System.out.println();
    }


    private static void showArray(int[] x) {
        System.out.print("Data in array: ");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+" ");

        }
        System.out.println();
    }
}
