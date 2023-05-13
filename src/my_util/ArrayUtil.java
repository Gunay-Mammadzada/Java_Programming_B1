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

}
