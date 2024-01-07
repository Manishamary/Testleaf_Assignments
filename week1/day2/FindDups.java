package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {14,67,26,34,11,14,26,34,55,1,67};
		Arrays.sort(num);
		System.out.println("Duplicate numers are:");
		for (int i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}

	}

}
