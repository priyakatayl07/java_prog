import java.util.*;
public class findchar {
    static boolean search(String str,char target){
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i));
            return true;
        }
        return false ;
    }
    public static void main(String[] args) {
        String str="priya";
        char ch='i';
        System.out.println(search(str,ch));
    
    }
    
}
