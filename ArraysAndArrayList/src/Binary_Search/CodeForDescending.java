package Binary_Search;

import java.util.Scanner;

public class CodeForDescending {
    static void binSearch2(int[] arr, int target){
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
                start = mid+1;
            }
            else {end = mid-1;

            }
        }
        System.out.println(foundAt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = sc.nextInt();
        binSearch2(arr,target);
    }
}
