package org.example.SearchingTechniques;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class LinearSearch
{
    public static void main( String[] args )
    {
        int[] a=new int[1000];
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int steps=0;
        int result=findIndexOfNumber(val, a,steps);
        if(result!= -1)
            System.out.println("Found the index: "+result);
        else{
            System.out.println("Not found index: ");
        }
    }

    public static int findIndexOfNumber(int val, int[] a, int steps) {
        for(int i=0;i<a.length;i++){
            steps++;
            if(a[i]==val){
                System.out.println("Steps in the Linear Search but found: "+steps);
                return i;
            }
        }
        System.out.println("Steps in the Linear Search but not found: "+steps);
        return -1;
    }
}
