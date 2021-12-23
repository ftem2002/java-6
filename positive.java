package halakat;

import java.util.Scanner;

public class positive
{

	public static void main(String[] args) 
	{
		int i , x , positive , nagative ;
		Scanner poin = new Scanner(System.in);
		System.out.println("enter 10 num : ");

		
		positive = 0;
		nagative = 0;
		
		for( i = 1; i<=10 ; i++)
		{
			x=poin.nextInt();
		if (x<0)
			nagative = nagative + 1;
		else
		positive = positive + 1;
		
		}
		System.out.println(positive);
		System.out.println(nagative);
		
		}
	}


