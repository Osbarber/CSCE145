import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		
		if(i == j)
		{
			System.out.println("i is equal to j");
		}
		else
		{
			System.out.println("i is not equal to j");
		}
		
		boolean less = i < j;
		
		if(less)	// same as if(i < j)
		{
			System.out.println("i is less than j");
		}
		
		System.out.println("Done!");
		
		boolean compound = i <= 5 && j != 6;
		//if(i <= 5 && j != 6)
		if(compound)
		{
			System.out.println("Compound was true");
		}

	}

}
