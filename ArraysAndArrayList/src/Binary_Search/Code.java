package Binary_Search;

import java.util.Scanner;

public class Code {
    static void binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int foundAt=-1;
        while(start<=end){
//            mid = (start+end)/2; there is possibility that (start + end) may exceed the int range,
            // for safety use
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                foundAt=mid;
                break;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        System.out.println(foundAt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = sc.nextInt();
        binSearch(arr,target);

    }// assuming array is sorted in ascending order
}
