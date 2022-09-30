package Assignment1;
import java.util.*;

public class Sol3 {
	public static int countPairs(String str)
	{
	if(str.equals("")||str.length()<3)
	return 0;
	if(str.charAt(0)==str.charAt(2))
	return 1+countPairs(str.substring(1));
	else
	return countPairs(str.substring(1));
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("\nCount Pairs");
		System.out.println("Enter the string");
		String str=scr.nextLine();
		int count=countPairs(str);
		System.out.println(count);
	}

}
