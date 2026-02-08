package org.example.SearchingTechniques;

public class BinaryUsingRecurrsion {
    public static void main(String[] args) {
        int[] a= {1,2,4,5,6,7,9,10};
        int target=10;
        int result=searchTargetInBinary(a,target, 0, a.length-1);
        System.out.println("We got this: "+result);
    }

    private static int searchTargetInBinary(int[] a, int target, int left, int right) {
        if(left<=right){
            int mid=(left+right)/2;

            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                return searchTargetInBinary(a,target, mid+1, right);
            }
            else {
                return searchTargetInBinary(a,target,left,right-1);
            }
        }
        return -1;
    }
}
