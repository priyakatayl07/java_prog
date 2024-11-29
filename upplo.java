import java.util.*;

public class upplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char ch = in.next().charAt(1);
        System.out.println( ch);
        
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("upper case");
        } else {
            System.out.println("Invalid input: Not an alphabetic character.");
        }
    
    }
}
