package linear_search;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] arr={7,6,54,8,99,55,66,88};
        int found=-1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                found=i;
                break;
            }
        }
        System.out.println(found);
    }
}
