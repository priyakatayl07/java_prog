import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=in.nextInt();
        int a=0,b=1,c=0;
        if(n==0){
            System.out.println("the 0th fibbonacci number is "+a);
        }
        if(n==1){
            System.out.println("the first fibbonacci number is "+b);
        }
        else{
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }

    }
    
}
