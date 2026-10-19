package linear_search;

import java.util.Scanner;

public class SearchInRange {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start > end || start<0 || end > arr.length-1) {
            System.out.println("Not found");
        }
        else { boolean found = false;
            for(int i = start; i <= end; i++) {
                if(arr[i] == target) {
                    found = true;
                    break;
                }
            }
            String res= found ?" element Found":"Not found";
            System.out.println(res);
        }

    }
}
