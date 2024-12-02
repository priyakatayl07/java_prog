import java.util.*;

public class allArmstrong {
    static boolean isArmstrong(int a) {
        int original = a;
        int sum = 0;

        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem * rem * rem; 
            a = a / 10; 
               }

        return sum == original; 
    }

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 999:");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) { 
                System.out.println(i);
            }
        }
    }
}
