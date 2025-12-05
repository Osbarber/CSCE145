import java.util.Scanner;

public class GradingCalculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int aRange = 89;
		int bRange = 79;
		int cRange = 69;
		int dRange = 59;

		System.out.println("Give me your HW, Lab, and Final exam grades: ");

		int hw = k.nextInt();
		int lab = k.nextInt();
		int finalExam = k.nextInt();

		float finalGrade = (hw * .4f) + (lab * .4f) + (finalExam * .2f);
		System.out.println(finalGrade);

		if(finalGrade > aRange)
		{
			System.out.println("A");
		}
		else if(finalGrade > bRange)
		{
			System.out.println("B");
		}
		else if(finalGrade > cRange)
		{
			System.out.println("C");
		}
		else if(finalGrade > dRange)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}		

	}

}
