import java.util.*;
public class findele {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.print("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            if(arr[i]==14){
                System.out.println("yes 14 is present in the array"+i);
            
                break;

            }
        }        
    }
    
}
