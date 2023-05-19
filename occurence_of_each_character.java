package strings;

import java.util.Scanner;

public class occurence_of_each_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		char[] arr=s.toCharArray();
		int count,temp=0;
		int cnt[]=new int[s.length()];
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					cnt[j]='0';
				}
			}
			if(arr[i]!='0')
			{
				cnt[temp]=count;
			}
		}
		for(int i=0;i<cnt.length;i++)
		{
			if(cnt[i]!='0')
			{
			System.out.println(arr[i]+"--->"+cnt[i]);
			}
		}
	}

}
