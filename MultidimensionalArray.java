package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
//        int [][] array=new int [3][4];
//        int [][] array1 = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//
//        };
//
//        System.out.println(array1[0][2]);
//
//        for (int[] ints : array1) {
//            System.out.println(Arrays.toString(ints));
//        }


        int [] array1 = {1,1,1,2,2,2,5,5,5};
        var uni = new int[array1.length];
        var cons = new int[array1.length];
        var con =0;


        for (int i = 0; i < array1.length; i++) {
            var elemet = array1[i];

            var exis = false;
            for (int j = 0; j < con; j++) {
                if (uni[j] ==elemet){

                }
            }
        }
    }
}
