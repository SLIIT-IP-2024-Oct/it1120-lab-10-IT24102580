import java.util.Scanner;
public class IT24102580Lab10Q1B {

	public static String isvalidRange (double number) {

		assert (number >= 0 && number <= 100) : "Invalid Mark";
		
		return "Mark is validated";

	}
	
	// method to calculate grade
	public static char calculateGrade (double mark1) {

			if (mark1 >= 75) {

				return 'A';

			} else if (mark1 >= 60) {

				return 'B';
			
			} else if (mark1 >= 50) {

				return 'C';
			
			} else if (mark1 >= 40) {

				return 'D';
			
			} else {
				
				return 'F';
			}
		
	} 
	
	// method to calculate valid grade for marks
	public static char isvalidGrade (double mark2) {
		
		assert (mark2 >= 75 && calculateGrade (mark2) == 'A') : "Incorret Grade assign";
		assert (mark2 >= 60 && calculateGrade (mark2) == 'B') : "Incorret Grade assign";
		assert (mark2 >= 50 && calculateGrade (mark2)== 'C') : "Incorret Grade assign";
		assert (mark2 >= 40 && calculateGrade (mark2) == 'D') : "Incorret Grade assign";
		assert (mark2 >= 0 && calculateGrade (mark2) == 'F') : "Incorret Grade assign";

		return calculateGrade (mark2);

	}


public static void main (String...args) {
	
	Scanner sc = new Scanner (System.in);

	System.out.print ("Enter your exam mark : ");
	double input = sc.nextInt ();

	System.out.println ("Your mark "+input+" is "+isvalidRange(input));
	System.out.println ("Your grade for "+input+" is "+isvalidGrade(input));

 }
}