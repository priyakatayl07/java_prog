import java.util.*;
public class swap1d {
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println("enter the value of arr:");
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("the array is :"+Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println("after swap the array is:"+Arrays.toString(arr));
    }
    
}
