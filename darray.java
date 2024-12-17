import java.util.*;
public class darray {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int[][]arr=new int [3][3];
       System.out.println("enter the values in arr:") ;
       for(int row=0;row<arr.length;row++){
        for(int col=0;col<3;col++){
            arr[row][col]=in.nextInt();
        }
}
for(int row=0;row<arr.length;row++){
System.out.println(Arrays.toString(arr[row]));
}
// for(int row=0;row<arr.length;row++){
//     for(int col=0;col<3;col++){
//         System.out.println(arr[row][col]);
//     }
// } second way to print array 



    }
    
}
