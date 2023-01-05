package SEARCHING;
import java.util.*;

class string{
    boolean search(String str , char ch){
        for (int i =0 ; i<str.length(); i++){
            if (ch == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
public class search_string {
    public static void main(String[] args) {
        System.out.println("Searching in string :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str  = sc.next();
        System.out.println("Enter character to search : ");
        char ch = sc.next().charAt(0);
        string s = new string();
        boolean ans = s.search(str,ch);
        System.out.println("Character present : " + ans);
    }
}
