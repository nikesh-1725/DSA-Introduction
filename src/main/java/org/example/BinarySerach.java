package org.example;

import java.sql.Time;
import java.util.Scanner;

public class BinarySerach {

    public static void main(String[] args) {
        int[] a={1,2,4,5,6,7,11,14};
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int result=findValueInArray(val,a);
        if(result != -1){
            System.out.println(System.currentTimeMillis());
            System.out.println(LinearSearch.findIndexOfNumber(val, a));
            System.out.println(System.currentTimeMillis());
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
        int low=0;
        int high=low+(a.length-1);

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid] == val){
                return mid;
            }
            else if(a[mid]<val){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
