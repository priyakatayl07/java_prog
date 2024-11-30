
import java.util.*;
public class swap {
    static void swapping(){
        Scanner in =new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=in.nextInt();
        System.out.print("enter the value of b:");
        int b=in.nextInt();
        System.out.println("before swapping a and b are:"+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a and b are:"+a+ " "+b);
        }
    public static void main(String[] args) {
        swapping();
        }
    
}
