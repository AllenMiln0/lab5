package lab5;
import java.util.*;

public class lab5 {
	
	public static void main(String args[]){
		//����������� ������: Init, GetFirst � GetSecond, Display (����� ���� �����), 
		//Read � �����, ��������� � ��������
		
		Osnov test = new Osnov();
		test.Read();
		test.Display();
		boolean f;
		f = test.DopMet();
		if (f) System.out.println("���������� ������ ���������");
		else System.out.println("���������� ������ �� ���������");
		
	}

	
}


