package lab5;
import java.util.*;

public class lab5 {
	
	public static void main(String args[]){
		//Реализовать методы: Init, GetFirst и GetSecond, Display (вывод всех полей), 
		//Read и метод, указанный в варианте
		
		Osnov test = new Osnov();
		test.Read();
		test.Display();
		boolean f;
		f = test.DopMet();
		if (f) System.out.println("Количество корней совпадает");
		else System.out.println("Количество корней не совпадает");
		
	}

	
}


