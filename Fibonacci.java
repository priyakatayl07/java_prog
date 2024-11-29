import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("enter a number:");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int a=0,b=1;
        for(int i=0;i<num;i++){
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}