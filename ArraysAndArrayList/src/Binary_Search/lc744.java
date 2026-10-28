package Binary_Search;
class Solution {
    public char nextGreatestLetter(char[] le, char ta) {
        if((int)le[le.length-1] <(int)ta) return le[0];
        for(int i=0;i<le.length;i++){
            if((int)le[i]>(int)ta){
                return le[i];
            }
        }
        return le[0];
    }// we can also use code used for ceiling of number with some changes
}