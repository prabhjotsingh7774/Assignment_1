package Assignment1;
import java.util.*;

public class Sol2 {
	public static String Star(String str)
	{
	if(str.equals("")||str.length()==1)
	return str;
	return str.charAt(0)+"*"+Star(str.substring(1));
	}

	public static void main(String[] args) {
		Scanner scr1=new Scanner(System.in);
		Scanner scr2=new Scanner(System.in);
		System.out.println("\nAll Stars");
		System.out.println("Enter the string : ");
		String str=scr2.nextLine();
		String nstr=Star(str);
		System.out.println(nstr);
	}
}
