class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int m =arr.length,k=arr[0].length;
        int i =0,j=k-1;
        while(j>=0 && i<m){
            if(arr[i][j]==tar) return true;
            else if(arr[i][j]>tar){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}