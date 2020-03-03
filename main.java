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
		
		System.out.print("Нажмите:\n0-Выход в главное меню\n1-Вывод Hellow world\n2-рассчет формулы:y*y + 3*sqrt(x)+ z\n3-Рекурсивный калькулятор\n4-Строки\n");
		
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
		if (key>4) System.out.print("Введите вверный номер меню\n");
		System.out.print("Нажмите:\n0-Выход в главное меню\n1-Вывод Hellow world\n2-рассчет формулы:y*y + 3*sqrt(x)+ z\n3-Рекурсивный калькулятор\n4-Строки\n");
		key = testKEY(in);
		}
	}
	
	
	
	 public static double test(Scanner in) {
	
		  boolean mainC = false;
		  while (mainC == false) {
		  if (!in.hasNextInt()) {
		  in.next();
		  System.out.println("Введите аргумент в правильном формате: ");
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
	    System.out.println("Введите аргумент в правильном формате: ");
	    }
	    else {
	    mainC = true;
	    }
	    }
	    return in.nextInt();
	    }

}

