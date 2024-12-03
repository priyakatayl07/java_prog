import java.util.*;
public class maxelement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("enter the elements:");
        for(int i =0;i<arr.length ;i++){
            arr[i]=in.nextInt();
        }
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];

                }}
            System.out.println("the max element in array is :"+max);
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println("the min element in array is:"+min);


 }

    }


    

