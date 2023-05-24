package day27_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {

        String s = "aP3d572&*jd@jdJU";

        int lowerCase = 0, upperCase = 0, digit = 0, others = 0;

        for (int i = 0; i < s.length(); i++) {

            if ( Character.isUpperCase( s.charAt(i) ) ) {
                upperCase++;
            } else if ( Character.isLowerCase( s.charAt(i) ) ) {
                lowerCase++;
            } else if ( Character.isDigit( s.charAt(i)) ) {
                digit++;
            } else {
                others++;
            }

        }

        System.out.println("Uppercase count: " + upperCase);
        System.out.println("Lowercase count: " + lowerCase);
        System.out.println("Digit count: " + digit);
        System.out.println("Other Characters count: " + others);

    }
}
