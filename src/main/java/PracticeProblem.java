import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		
		System.out.println(Math.abs(num));

	}

	public static void q2() {
		//Write question 2 code here
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		
		double value = num/num2;
		System.out.println(Math.floor(value));
		System.out.println(Math.ceil(value));

	}

	public static void q3() {
		//Write question 3 code here
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		
		System.out.println(Math.round(Math.sqrt(num)));

	}

	public static void q4() {
		//Write question 4 code here
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		
		System.out.println(Math.pow(num, num2));

	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		double num = in.nextDouble();
		in.nextLine();
		
		System.out.print("Input another number: ");
		double num2 = in.nextDouble();
		in.nextLine();
		
		System.out.print("Input one more number: ");
		double num3 = in.nextDouble();
		in.nextLine();

		double value = Math.max(num, num2);
		double answer = Math.max(value, num3);

		System.out.println(answer);

		double value2 = Math.min(num, num2);
		double answer2 = Math.min(value2, num3);

		System.out.println(answer2);

	}
	public static void q6() {
		//Write question 5 code here
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String word = in.nextLine();

		System.out.println(word.contains("on"));

	}
	public static void q7() {
		//Write question 5 code here
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input the word mango: "):
		String word = in.nextLine();

		String mango = 

	}
	public static void q8() {
		//Write question 5 code here
		
	}

	public static void q9() {
		//Write question 5 code here
		
	}
	public static void q10() {
		//Write question 5 code here
		
	}

	public static void q11() {
		//Write question 5 code here
		
	}

	public static void q12() {
		//Write question 5 code here
		
	}
	

}
