package day25_methods;

import my_util.ArrayUtil;

public class UsingArrayUtill {
    public static void main(String[] args) {
        int[] arr = new int []{23,34,54,65};
        ArrayUtil.minNumInArr(arr);
        ArrayUtil.minNumInArr(new int[]{16,28,3,45});

        System.out.println(ArrayUtil.minNumInArrWithSort(arr));
        System.out.println(ArrayUtil.minNumInArrWithSort(new int[]{16,28,3,45}));

    }
}
