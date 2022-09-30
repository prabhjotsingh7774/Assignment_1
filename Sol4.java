package Assignment1;

import java.util.Scanner;

public class Sol4 {
	public static boolean nestParen(String str)
	{
	if(str.equals(""))
	return true;
	if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
	return nestParen(str.substring(1,str.length()-1));
	else
	return false;
	}

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("\nNested Parenthesis");
		System.out.println("Enter the string");
		String str=scr.nextLine();
		boolean val=nestParen(str);
		System.out.println(val);
	}

}
