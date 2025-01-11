public class binarysearch {
    static int searchele(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;  
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,4,5,6,7,8,12,45,89};
        int target=89;
        System.out.println("the element is at index:"+searchele(arr,target));
    }
    
}
