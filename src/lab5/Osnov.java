package lab5;

import java.util.Scanner;
import java.util.Random;

public class Osnov {
	private int k;
	private Koef k1 = new Koef();
	private Koef k2 = new Koef();
	
	public boolean DopMet() {
		double a1, b1;
		int sum;
		a1 = k1.Discrim();
		if (a1 > 0) sum = 2;
		else if (a1 == 0) sum = 1;
			else sum = 0;
		
		b1 = k2.Discrim();
		if (b1 > 0) sum = sum + 2;
		else if (b1 == 0) sum = sum + 1;
			else sum = sum + 0;
		
		if(sum == k) return true;
		else return false;
	}
	
	public void Init(int l, double a, double b) {
		k = l;
		k1.Init(a, b);
		k2.Init(a, b);
	}
	
	public void Read() {
		System.out.printf("¬ведите k ");
		Scanner scn3 = new Scanner(System.in);
		k = scn3.nextInt();
		k1.Read();
		k2.Read();
	}
	
	public void Display() {
		System.out.printf("K = %d", k);
		System.out.println(" ");
		k1.Display();
		k2.Display();
	}
}