// This program attempts to calculate the message digest of a message


import java.security.MessageDigest;
import java.util.Scanner;

public class SHA{

	public static void main(String[] args) throws Exception{
    
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Credit Card Number");  
		String str= sc.nextLine();        
        System.out.println ("Original plain text for Hash Generation : " + str);
        System.out.println ("Attempting to calculate message digest ...");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte [] ba = str.getBytes("UTF8");
        md.update (ba);
        byte [] digest = md.digest ();
        System.out.println ("Result: Success");

        // Display plain text and digest
        System.out.println ("Hashed text is : " + String.valueOf(digest));
        System.out.println ("Program execution was successful ...");
        }
}