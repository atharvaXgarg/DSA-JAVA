package Binary_Search;

public class MountainArray {
    int[] k;
    MountainArray(int[] arr) {
        k=arr;
    }
    int get(int x){
        for(int j=0;j<k.length-1;j++){
            if(k[j]==x){
                return j;
            }
        }
        return -1;
    }
    int length(){
        return k.length;
    }
}
// ye leetcode wala question intellij pr error na de isliye banayi hai