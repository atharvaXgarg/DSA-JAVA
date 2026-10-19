package linear_search;

import java.util.Scanner;

public class StringSearch
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String target = sc.nextLine();
        System.out.println(s.indexOf(target));
    }
}
