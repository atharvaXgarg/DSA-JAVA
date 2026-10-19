package linear_search;
import java.util.Scanner;

public class SearchIn2D
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean found = false;
        for (int[] row : arr) {
            for (int k: row) {
                if (k==target) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}
