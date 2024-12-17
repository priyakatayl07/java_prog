import java.util.*;
class maxelement{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("enter the values of  arr:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max element is :"+max);

    }
}