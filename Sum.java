import java.util.Scanner;

class Sum {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a first number:");
        int a=input.nextInt();
        System.out.println("enter the 2nd number:");
        int b =input.nextInt();
        int sum=a+b;
        System.out.println("the sum is :"+sum);
    }
    
}
