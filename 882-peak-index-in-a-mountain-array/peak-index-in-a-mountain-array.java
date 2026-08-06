class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int high = arr.length-2;
        int index = -1;
        int low =1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                index = mid;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = high -1;
            }
        }
        return index;
    }
}