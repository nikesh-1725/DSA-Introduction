package org.example.SortingTechniques;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] a={5,6,8,1,3,2,0,-1};
        System.out.println("Sorted using Bubble Sort: "+ Arrays.toString(bubbleSort(a, a.length)));

    }

    private static int[] bubbleSort(int[] a, int len) {
        int temp=0;
        for(int i=0;i<len;i++){
            int count=0;
            for (int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    // 8 1
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                count++;
            }
            System.out.println("Count: "+count);
            System.out.println(Arrays.toString(a));
        }
        return a;
    }

}
