//Leetcode Q-88
//CCI - Chapter 10 - Q1
//Merge Sorted Array
class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int indexA = m-1;
        int indexB = n-1;
        int mergeIndex = a.length-1;
        
        while(indexB >= 0) {
            if(indexA>=0 && a[indexA] > b[indexB])
                a[mergeIndex--] = a[indexA--];
            else
                a[mergeIndex--] = b[indexB--];
        }
    }
}