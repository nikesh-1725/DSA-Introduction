package org.example.SortingTechniques;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a={5,6,8,1,3,2,0,-1};
        System.out.println("Sorted using Selection Sort: "+ Arrays.toString(selectionSort(a, a.length-1)));

        System.out.println();
    }

    private static int[] selectionSort(int[] a, int length) {
        int temp=0;
        int minIndex =-1;
        // -1
        for(int i=0;i<length;i++){
            minIndex=i;
            for(int j=i+1;j<=length;j++){
                //5,6,8,1,3,2,0,-1
                if(a[minIndex]>=a[j]){
                    minIndex =j;
                    System.out.println(minIndex);
                }
            }

           temp=a[minIndex];
            a[minIndex]= a[i];
            a[i]=temp;

        }
        return a;
    }
}
