package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {


        int i = 5;
        int z = i++; // z=5; i=i+1; -->


        int a = 10;
        int b = a + 1;
        System.out.println(a);
        System.out.println(b);

        int c = ++a; // int c = (a = a + 1)
        System.out.println(c);

        int d = a++;

        // int d = a; a=a+1
        System.out.println(d);


    }


}
