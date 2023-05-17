package my_util;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * This method will accept on int array
     * And will return the minium
     *
     */
    public static int minNumInArr (int [] arr){
        int min = arr [0];
        for (int each:arr){
            if(each<min){
                min=each;

            }
        }
        return min;
    }

    public static int minNumInArrWithSort (int []arr){
        Arrays.sort(arr);
        return arr[0];

    }



/**
 * This method will accept an int array and the num
 * It will return if the number exists in the array
 */
public static boolean containArr (int [] arr, int num){
    for (int each: arr){
        if (each ==num){
            return true;
        }
    }

    return false;
}

    /**
     * This method accepts int array and number
     * and returns the indesx of the number in the array
     * If it does not exist,it returns -1
     */

    public static int indexOf(String[] strs, String element) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }
    /**
     * This method accepts String array and number
     * and returns the indesx of the String in the array
     * If it does not exist,it returns -1
     */

    public static int indexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }

        return -1;
    }
    /**
     *
     * This method accepts int array and the int num
     * And returns the a new array with the num added at the end
     */
    public static int [] add (int [] arr, int num) {

        int [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = num;

        return newArr;

    }

    /**
     *
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String [] add (String [] arr, String word) {

        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;

    }
}

