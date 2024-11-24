package Recusrion;

import java.util.Scanner;

public class palindromechecker {

    
    static boolean checkPalindrome(String str,int first,int last)
    {
            //base case
            if(first>=last)
            {
                return true;

            }

            if(str.charAt(first)!=str.charAt(last))
            {
                return false;
            }

            return checkPalindrome(str, first+1, last-1);

    }
    
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked : ");
        String text = sc.nextLine();
        System.out.println(checkPalindrome(text.toLowerCase(), 0, text.length()-1));

        
    }
}
