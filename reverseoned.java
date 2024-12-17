import java.util.*;
public class reverseoned {
    static void swap(int[]arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int [] arr=new int[6];
        System.out.print("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("elements are:"+Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println("elements after swapping:"+Arrays.toString(arr));
        reverse(arr);
        System.out.println("after reverse elements are:"+Arrays.toString(arr));
    }
    
}
