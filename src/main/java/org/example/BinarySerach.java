package org.example;

import java.util.Scanner;

public class BinarySerach {

    public static void main(String[] args) {
        int[] a={1,2,4,5,6,7,11,14};
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int result=findValueInArray(val,a);
        if(result != -1){
            System.out.println("Found the index: "+result);
        }
        else{
            System.out.println("Not found the index");
        }
    }

    private static int findValueInArray(int val, int[] a) {
        /**
         * a[] => first value and end value we need to take
         * then
         *
         **/

        return -1;
    }
}
