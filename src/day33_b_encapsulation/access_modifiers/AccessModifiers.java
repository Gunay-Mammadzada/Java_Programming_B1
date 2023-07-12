package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {
    public int a;
    int b;

    private int c;
     static int y;
      private  static int z;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(obj.c);
        System.out.println(obj.z);
        System.out.println(obj.y);

        //System.out.println(AccessModifiers.c); // since c is instance, cant not reach by classname. We need an object to reach.
        System.out.println(AccessModifiers.z);
        System.out.println(AccessModifiers.y);


    }

}
