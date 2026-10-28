package Binary_Search;

import java.util.Scanner;

public class CeilAndFloorOfNumInArray {
    static int findCeil(int[] arr,int target) {
        // assuming array is sorted and not null
        int start = 0;
        int end = arr.length-1;
        int mid=-1;
        while (start <= end) {
             mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(arr[mid]>target){
            return arr[mid];
        }
        try {
            return arr[start];
        }catch (Exception e){
            return -1;
        }

    }
    public static int findFloor(int target, int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return array[mid];
            }
            else if (array[mid] < target) {
                start = mid + 1;
            }
            else if (array[mid] > target) {
                end = mid - 1;
            }

        }
        if(end>=0){
            return array[end];
        }
        return -1;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int []arr={2,3,5,9,14,16,18};
        int target = sc.nextInt();
        System.out.println(findCeil(arr,target));
        System.out.println(findFloor(target,arr));
    }
}
