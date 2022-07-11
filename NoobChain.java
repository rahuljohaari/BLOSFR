package farmer;

import java.util.ArrayList;
import java.util.*;
//import com.google.gson.GsonBuilder;

public class NoobChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	public static int difficulty = 5;
    public static String str0,str1,str2,str3,str4,str5,str6,str7,str8,str9,str10,str11,str12,str13,str14,str15,str16,str17,str18,str19;
    public static String str20,str21,str22,str23,str24,str25,str26,str27,str28,str29,str30,str31;
    static int num1;
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		try
		{
		//add our blocks to the blockchain ArrayList:
		str0=args[0];
		str1=args[1];
		str2=args[2];
		str3=args[3];
		str4=args[4];
		str5=args[5];
		str6=args[6];
		str7=args[7];
		str8=args[8];
		str9=args[9];
		str10=args[10];
		str11=args[11];
		str12=args[12];
		str13=args[13];
		
											
		System.out.println("Farmer First Name is" + str0);
		System.out.println("Farmer Last Name is" + str1);
		System.out.println("Farmer Mobile Number is" + str2);
		System.out.println("Farmer Age is" + str3);
		System.out.println("Farmer Aadhar Card Number" + str4);
		System.out.println("Farmer Village Name is" + str5);
		System.out.println("Farmer Block Name is" + str6);
		System.out.println("Farmer District Name is" + str7);
		System.out.println("Farmer State Name" + str8);
		System.out.println("Farmer Total Land(In Acres)" + str9);
		System.out.println("Farmer Major Crop Grown 1 is " + str10);
		System.out.println("Farmer Major Crop Grown 2" + str11);
		System.out.println("Farmer Major Crop Grown 3" + str12);
		System.out.println("Farmer Animal/Livestock" + str13);
		System.out.println("Farmer KVK" + str14);
		str15=str0+str1+str2+str3+str4+str5+str6+str7+str8+str9+str10+str11+str12+str13+str14;
		num1=str15.length();
		str16=str15; 
		if (num1<360)
		{
			System.out.println("Record Length is < 360"+ num1);
			System.out.println("Padding needed");
			str16=padding(str15);
			int num2=str16.length();
			System.out.println("The total Farmer record length now is "+ num2);
		}
		
			
		//Farmer Record length is now : 360 bits
		//Creating 10 block of 36 bits each
		str17=str16.substring(0, 35);
		str18=str16.substring(36, 71);
		str19=str16.substring(72, 107);
		str20=str16.substring(108, 143);
		str21=str16.substring(144, 179);
		str22=str16.substring(180, 215);
		str23=str16.substring(216, 251);
		str24=str16.substring(252, 287);
		str25=str16.substring(288, 323);
		str26=str16.substring(324, 359);
		System.out.println("Contents for the first block" + str17);
		System.out.println("Contents for the second block" + str18);
		System.out.println("Contents for the third block" + str19);
		System.out.println("Contents for the fourth block" + str20);
		System.out.println("Contents for the fifth block" + str21);
		System.out.println("Contents for the six block" + str22);
		System.out.println("Contents for the seventh block" + str23);
		System.out.println("Contents for the eighth block" + str24);
		System.out.println("Contents for the nine block" + str25);
		System.out.println("Contents for the tenth block" + str26);
		System.out.println("Chaining, first block of record  ..... ");
		addBlock(new Block(str17, "0"));
		//For the first block,the previous hash block value is 0.
		System.out.println("Chaining, second block of record.... ");
		addBlock(new Block(str18,blockchain.get(blockchain.size()-1).hash));
		
		System.out.println("Chaining, third block of record.... ");
		addBlock(new Block(str19,blockchain.get(blockchain.size()-1).hash));	
		
		
		System.out.println("Chaining, fourth block of record.... ");
		addBlock(new Block(str20,blockchain.get(blockchain.size()-1).hash));	
		
		System.out.println("Chaining, fifth block of record.... ");
		addBlock(new Block(str21,blockchain.get(blockchain.size()-1).hash));
		
		System.out.println("Chaining, sixth block of record.... ");
		addBlock(new Block(str22,blockchain.get(blockchain.size()-1).hash));	
		
		System.out.println("Chaining, seventh block of record.... ");
		addBlock(new Block(str23,blockchain.get(blockchain.size()-1).hash));	
		
		System.out.println("Chaining, eight block of record.... ");
		addBlock(new Block(str24,blockchain.get(blockchain.size()-1).hash));
		
		System.out.println("Chaining, nineth block of record.... ");
		addBlock(new Block(str25,blockchain.get(blockchain.size()-1).hash));	
		
		System.out.println("Chaining, tenth block of record.... ");
		addBlock(new Block(str26,blockchain.get(blockchain.size()-1).hash));	
		
		//System.out.println("Chaining, fifth block of Credit Card.... ");
		//addBlock(new Block(str9,blockchain.get(blockchain.size()-1).hash));	
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Total time in nanosecond consumed during programm execution is "+ totalTime);
		
		 
		}catch(Exception e)
	{
		System.out.print(e);
	}
	}
	
	public static String padding(String str16a)
	{
		String paddedstring=null;
		
		int padreq=0;
		if(str16a.length()<360)
		 padreq=360-(str16a.length());
		String pad=new String();
		for(int i=0; i<padreq;i++)
		{
			pad=pad+'\u0000';
		//	char c1='\u0000';
		}
			paddedstring=str16a+pad;
			System.out.println("Length of padded string is now "+ paddedstring.length());
		return paddedstring;
		
	}
	public static void addBlock(Block newBlock) {
			blockchain.add(newBlock);
	          System.out.println("Printing the contents of Block(Arraylist)\n ");
		      for (int i = 0; i < blockchain.size();i++) 
		      { 		      
		          System.out.println(blockchain.get(i)); 		
		      } 
	}


}


