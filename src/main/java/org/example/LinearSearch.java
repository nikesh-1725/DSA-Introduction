package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class LinearSearch
{
    public static void main( String[] args )
    {
        int[] a={1,4,5,6,8,11};
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int result=findIndexOfNumber(val, a);
        if(result!= -1)
            System.out.println("Found the index: "+result);
        else{
            System.out.println("Not found index: ");
        }
    }

    public static int findIndexOfNumber(int val, int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                return i;
            }
        }
        return -1;
    }
}
