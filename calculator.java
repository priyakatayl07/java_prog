import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter a first number:");
        int a=in.nextInt();
        System.out.print("enter a second number :");
        int b =in.nextInt();
        System.out.print("enter a operator:");
        char op=in.next().charAt(0);
        int c=0;
        if(op=='+'){
            c=a+b;
            System.out.println("the sum is :"+c);
        }
        else if(op=='-'){
            c=a-b;
            System.out.println("the sub is :"+c);
        }
        else if (op=='/'){
            c=a/b;
            System.out.println("the ans is :"+c);
        }
        else if(op=='*'){
            System.out.println("the ans is :"+c);
        }
        else{
            System.out.println("operator is invalid");
        }
    }
    
}
