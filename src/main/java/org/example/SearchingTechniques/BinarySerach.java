package org.example.SearchingTechniques;

import java.util.Scanner;

public class BinarySerach {

    public static void main(String[] args) {
        int[] a =new int[4];
        a[1]=50;
        a[2]=60;
        a[3]=70;
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int steps=0;
        int steps1=0;
        int result=findValueInArray(val,a, steps);
        int result1 =LinearSearch.findIndexOfNumber(val, a, steps1);
        if(result != -1){
            System.out.println("Found index in Binary Search: "+result);
        }
        else{
            System.out.println("Not found index in Binary Search");
        }
        if(result1 != -1){
            System.out.println("Found index in Linear Search: "+result1);
        }
        else{
            System.out.println("Not found index in Linear Search");
        }
    }

    public static int findValueInArray(int val, int[] a, int steps) {
        /**
         * a[] => first value and end value we need to take
         * then
         *
         **/
        int low=0;
        int high=low+(a.length-1);
        while(low<=high)
        {
            steps++;
            int mid=(low+high)/2;
            if(a[mid] == val){
                System.out.println("Steps in Binary Search: "+steps);
                return mid;
            }
            else if(a[mid]<val){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Steps in Binary Search: "+steps);
        return -1;
    }
}
