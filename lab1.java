package lab;

import java.util.Scanner;

public class lab1 extends main{

	public static void HW() {
		System.out.print("Hello world\n");
	}
	
	static void calc(Scanner in) 
	  {
		
		double n;
		System.out.print("������� ����� y:\n");
		double y=0;
		y = main.test(in);
		
		System.out.print("������� ����� �:\n");
		double x = -1;
		x = main.test(in);
		while(x<0) {
		System.out.print("�� ����� ������������� ��������!");	
		x = main.test(in);
		}
		System.out.print("������� ����� z:\n");
	    double z = 0;
	    z = main.test(in);
	    
	    n=y*y+3*Math.sqrt(x)+z; 
	    n=n*100;
	    int result1 = (int)Math.round(n);
	    float result2 = (float) result1 / 100;
	    
		System.out.print(result2+ "\n");
	  }
	
	
	}
	
	

