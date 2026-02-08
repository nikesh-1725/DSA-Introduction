package org.example.SortingTechniques;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={5,6,8,1,3,2,0,-1};
        System.out.println("Sorted using Selection Sort: "+ Arrays.toString(insertionSort(a, a.length)));
    }

    private static int[] insertionSort(int[] a, int len) {


        for(int i=1;i<len;i++){
           int key=a[i];
           int j=i-1;
            while (j>=0 && a[j]<key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;

        }

        return a;
    }
}
