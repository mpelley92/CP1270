package core;

import java.util.*;

public class seven {
	public static void main(){
		Scanner input = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.print("Enter first number:\t\t");
		fnum = input.nextDouble();
		System.out.print("Enter second number:  +\t");
		snum = input.nextDouble();
		answer = fnum + snum;
		System.out.println("The answer is:\t\t  =\t" + answer);
	}
}
