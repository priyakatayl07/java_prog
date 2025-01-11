public class orderagnosticbs {
    static int searchelebs(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={99,88,77,66,55,44,33,22,11};
        int target=11;
        int ans=searchelebs(arr,target);
        System.out.println(ans);
    }
}
