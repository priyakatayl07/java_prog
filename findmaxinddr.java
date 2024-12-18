import java.util.*;
public class findmaxinddr {
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<2;col++){
            if(arr[row][col]>max){
                max=arr[row][col];
            
            }
            }
        }
        return max;
}
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int[][]arr=new int[3][2];
    System.out.println("enter a number:");
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<2;col++){
            arr[row][col]=in.nextInt();
        }

    }
    for(int row=0;row<arr.length;row++){
    System.out.println(Arrays.toString(arr[row]));
    }
    System.out.println("the maximum value in array:"+max(arr));      
    }

    
}
