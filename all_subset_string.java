package strings;

import java.util.Scanner;

public class all_subset_string {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();	
		int len=str.length();	
		//len*(len+1)/2 is total number of subsets...
		String str1[]=new String[len*(len+1)/2];
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				str1[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("Subset of all strings are:");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();
		
		int len=str.length();
		String str1[]=new String[len*(len+1)/2];
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				str1[temp]=str.substring(i,j+1);
				temp++;
			}
		}	
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
	}
}
