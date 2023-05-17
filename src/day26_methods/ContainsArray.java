package day26_methods;

public class ContainsArray {
    public static boolean containArr (int [] arr, int num){
        for (int each: arr){
            if (each ==num){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,66,81};
        int num = 5;

        System.out.println(containArr(arr, num));

    }
}

