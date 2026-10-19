package linear_search;

public class maxAndMin {
    public static void main(String[] args) {
        int[] arr= new int[]{7,9,11, 20, 13, 4};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            max=max<arr[i]?arr[i]:max;
            min=min>arr[i]?arr[i]:min;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
