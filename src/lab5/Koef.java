package lab5;

import java.util.Scanner;
import java.util.Random;

public class Koef {
	
		private	double p;
		private	double q;
		
		public void Init(double a, double b) {
			p = a;
			q = b;
		}
		
		public double GetFirst() {
			return p;
		}
		public double GetSecond() {
			return q;
		}
		public void Display() {
			System.out.printf("p = %f", p,"  q = %f", q);
			System.out.println(" ");
			System.out.printf("q = %f", q);
			System.out.println(" ");
		}
		
		public void Read() {
			System.out.println("¬ведите p");
			Scanner scn = new Scanner(System.in);
			p = scn.nextDouble();
			System.out.println("¬ведите q");
			Scanner scn1 = new Scanner(System.in);
			q = scn1.nextDouble();
		}
		
		public double Discrim() {
			double d;
			d = p*p - 4*q;
			return d;
		}

	
}




