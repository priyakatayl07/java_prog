import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num=in.nextInt();
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println("the  reversed number is:"+ans);
    }
    
}
