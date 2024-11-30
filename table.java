import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter a number:");
        int x=in.nextInt();
        int y=0;
        for(int i=0;i<=10;i++){
            y=x*i;
            System.out.println(x+"*"+i+"="+(y));
        }

    }
    
}
