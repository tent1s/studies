package lab;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;




public class main {

	public static void main(String[] args) throws ParseException, IOException {
		Scanner in = new Scanner(System.in);
		displayInfo(in);
		
	}
	
	 
	public static void displayInfo(Scanner in) throws ParseException, IOException {
		
		System.out.print("�������:\n0-����� � ������� ����\n1-����� Hellow world\n2-������� �������:y*y + 3*sqrt(x)+ z\n3-����������� �����������\n4-������\n");
		
		int key = 0;
		key = testKEY(in);
		while(key!=0)
		{	
		switch(key) 
		{
		case 1:
		   lab1.HW();
		break;
		case 2:
			lab1.calc(in);
		break;
		case 3:	
			lab2.lab2();
		break;
		case 4:	
			lab3.lab3();
		break;
		}
		if (key>4) System.out.print("������� ������� ����� ����\n");
		System.out.print("�������:\n0-����� � ������� ����\n1-����� Hellow world\n2-������� �������:y*y + 3*sqrt(x)+ z\n3-����������� �����������\n4-������\n");
		key = testKEY(in);
		}
	}
	
	
	
	 public static double test(Scanner in) {
	
		  boolean mainC = false;
		  while (mainC == false) {
		  if (!in.hasNextInt()) {
		  in.next();
		  System.out.println("������� �������� � ���������� �������: ");
		  }
		  else {
		  mainC = true;
		  }
		  }
		  return in.nextDouble();
		  }
	

     public static int testKEY(Scanner in) {
	
	    boolean mainC = false;
	    while (mainC == false) {
	    if (!in.hasNextInt()) {
	    in.next();
	    System.out.println("������� �������� � ���������� �������: ");
	    }
	    else {
	    mainC = true;
	    }
	    }
	    return in.nextInt();
	    }

}

