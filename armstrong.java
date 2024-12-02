import java.util.*;
public class armstrong {
    static void isArmstrong(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a value of a:");
        int a=in.nextInt();
        int original=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum=sum+rem*rem*rem;
            a=a/10;
        }
        if(sum==original){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not a armstrong");
        }
    }
    public static void main(String[] args) {
        isArmstrong();
    }

    
}
