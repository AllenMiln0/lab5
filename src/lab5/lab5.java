package lab5;
import java.util.*;
import java.util.Random;

public class lab5 {
	
	public static void main(String args[]){
		//Реализовать методы: Init, GetFirst и GetSecond, Display (вывод всех полей), 
		//Read и метод, указанный в варианте
		Random random = new Random();
		Koef [] fff;
		fff = new Koef[5];
		for(int i = 0; i < 5; i++) {
			fff[i] = new Koef();
		}
		
		for (int i = 0; i < 5; i++) {
			fff[i].Init(random.nextDouble(), random.nextDouble());
		}
		
		double[] rez = new double[5];
		for (int i = 0; i<5; i++) {
			rez[i] = fff[i].Discrim();
			fff[i].Display();
		}
		double a = rez[0];
		for(int i = 0; i < 5; i++) {
			if(rez[i] > a) a = rez[i];
			System.out.printf("%d rez = %f \n" , i, rez[i]);
		}
		System.out.printf("Максимальный эл-т: %f", a);
		
		
		
		
	}

	
}


