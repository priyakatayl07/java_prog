import java.util.*;
public class factorial {
    static int fact(int a){
        if(a==0){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("enter the value of n :");
    int n =in.nextInt();
    fact(n);
    System.out.println("the factorial of a number is:"+" " +fact(n));
    
}}
