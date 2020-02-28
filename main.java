package lab;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		 lab1 ourlab1 = new lab1();
		 double keym = -1;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Меню Лабораторных работ:\nВведите номер лабораторной работы(1-1)\nДля выхода введите 0\n ");
		 keym = test(keym);
			
		 while(keym!=0){
		 if(keym == 1) {ourlab1.displayInfo();}
		 System.out.println("Меню Лабораторных работ:\nВведите номер лабораторной работы(1-1)\nДля выхода введите 0\n ");
		 keym = in.nextInt();
			}
	}
	
	
	
	
	
	
	
	
	
	public static double test(double testP) {
	
	    Scanner in = new Scanner(System.in);
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
		return testP = in.nextInt();
				}
	
}

