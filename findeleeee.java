import java.util.*;
public class findeleeee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][]arr=new int[3][2];
        System.out.print("enter the values in 2D array:");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<2;col++){
                arr[row][col]=in.nextInt();
                if(arr[row][col]==6){
                    System.out.println("element present"+" "+row+" "+col);
                    break;
                }
            }

        }
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
            
        }

    }
    
}
