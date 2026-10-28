package Binary_Search;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
// given MountainArray is interface
class Solutn {
    public int findInMountainArray(int target, MountainArray mo) {
        // step 1 find the peak element of array
        int start =0, end=mo.length()-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(mo.get(mid)>mo.get(mid+1)){
                // descending order so we'd to move towarsds left
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        int peak=start;System.out.print(peak);


        // step 2 search in 1st half
        start=0;end=peak;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(mo.get(mid)>target){
                end=mid-1;
            }
            else if(mo.get(mid)<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        // if we don't get in 1st half go for right half binary search for descending
        start=peak+1;end=mo.length()-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(mo.get(mid)>target){
                start=mid+1;
            }
            else if(mo.get(mid)<target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        // issme bhi na mila to nhi mila return -1
        return -1;


    }
}
// ignore this error thats due to in this question leetcode is doing some api call