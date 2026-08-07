class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int row=arr.length;
        int col=arr[0].length;
        int low =0;
        int high = row*col-1;
        while(low<=high){
            int mid =(low+high)/2;
            int midRow = mid/col, midCol=mid%col;
            if(arr[midRow][midCol]==tar) return true;
            else if(arr[midRow][midCol]>tar) high =mid-1;
            else low = mid+1;
        }
        return false;
    }
}