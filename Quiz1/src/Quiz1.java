import java.util.Scanner;

public class Quiz1 {

	static Scanner input = new Scanner(System.in);
	private static double  ATT, COMP, YDS, TD, INT;
	public static void main(String[] args) {
		System.out.println("Number of passing attempts: ");
		double temp;
		temp = input.nextDouble();
		if(temp > 2.375){
			ATT = 2.375;
		} else ATT = temp;
		System.out.println("Number of completions: ");
		temp = input.nextDouble();
		if(temp > 2.375){
			COMP = 2.375;
		} else COMP = temp;
		System.out.println("Number of passing yards: ");
		temp = input.nextDouble();
		if(temp > 2.375){
			YDS = 2.375;
		} else YDS = temp;
		System.out.println("Number of touchdown passes: ");
		temp = input.nextDouble();
		if(temp > 2.375){
			TD = 2.375;
		} else TD = temp;
		System.out.println("Number of interceptions: ");
		temp = input.nextDouble();
		if(temp > 2.375){
			INT = 2.375;
		} else INT = temp;
		
		double a = (COMP/ATT - .3) * 5;
		double b = (YDS/ATT - 3) * .25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - (INT/ATT * 25);
		double PR = ((a + b + c + d) / 6) * 100;
		
		System.out.println("Quarterback Rating: " + PR);
		
	}

}