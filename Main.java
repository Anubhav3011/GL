import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		char c[] = String.valueOf(num).toCharArray();
		boolean isPalindrome = true;
		int i=0, j=c.length - 1;
		while(i<=j)
		{
			if(c[i++]!=c[j--])
			{
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
		System.out.println("\n");
	}

	// function to printPattern

	public void printPattern() {
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		while(num != 0)
		{
			for(int i=num; i>0; i--) System.out.print("*");
			System.out.println();
			num--;
		}
		System.out.println("\n");
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.print("Enter number: ");
		long num = sc.nextLong();
		boolean isPrime=true;
		if(num==0 || num==1)
		{
			System.out.println("Neither prime nor composite");
		}
		else if(num==2)
		{
			System.out.println("Prime");
		}
		else
		{
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(!isPrime)
				System.out.println("Not Prime");
			else
				System.out.println("Prime");
		}
		System.out.println("\n");
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		long arr[] = new long[num];
		for(int i=0; i<num; i++)
		{
			if(i==0)
				arr[i] = first;
			else if(i==1)
				arr[i] = second;
			else
			{
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.println(Arrays.toString(arr).substring(1).replace("]",""));
		System.out.println("\n");
	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
