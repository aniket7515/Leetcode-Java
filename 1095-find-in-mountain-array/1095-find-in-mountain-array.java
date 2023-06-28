/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        
        int first= func(mountainArr,0,peak,target);
        if(first!=-1) return first;
        
        int second= func(mountainArr,peak+1,mountainArr.length()-1,target);
        return second;
        
    }
    public int func(MountainArray arr, int start, int end, int target){
        boolean flag= arr.get(start)<arr.get(end);
        
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr.get(mid)==target) return mid;
            if(flag){
                if(arr.get(mid)>target){
                    end=mid-1;
                }else start=mid+1;
            }
            if(!flag){
                if(arr.get(mid)>target) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
        
    }
    public int findPeak( MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        int mid=0;
        while(start<end){
            mid= (start+end)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}