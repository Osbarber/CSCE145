import java.util.Scanner;
public class Branching {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please give me two numbers: ");
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		System.out.println("1.) Add\n2.) Subtract");
		int ui = keyboard.nextInt();
		if(ui == 1)
		{
			int c = a + b;
			System.out.println(c);
		}
		else
		{
			int c = a - b;
			System.out.println(c);
		}
		
	}

}
