/*
 * Oceana Barber
 */
import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("I can make a triangle. Please enter a number:"); //asks for user input
		int s = k.nextInt();
		
		//number of rows based on s (user input); increase due to i++
		for (int i = 1; i <= s; i++) 
		{
			//number of row = number of stars ex: 2nd row = 2 starts; 3rd row = 3 stars;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //moves rows to next line
            System.out.println();
        }
         
		//each row decreases due to i--
		for (int i = s - 1; i >= 1; i--) 
		{
			
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
		}

        k.close();				
	}

}
