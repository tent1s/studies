package lab;

import java.util.Scanner;

public class lab1 {

	double key= 0;
	
	
	
	
	void displayInfo() {
	System.out.print("�������:\n0-����� � ������� ����\n1-����� Hellow world\n2-������� �������:y*y + 3*sqrt(x)+ z\n");
	Scanner in = new Scanner(System.in);
	main ourlab1 = new main();
	key = ourlab1.test(key);
	
	while(key!=0){
		
	if(key==1){
	System.out.print("Hello world\n");
	}
	
	if(key==2){
	System.out.print("������� ����� y:\n");
	double y=0;
	y = ourlab1.test(y);
	
	System.out.print("������� ����� �:\n");
	double x = -1;
	x = ourlab1.test(x);
	while(x<0) {
	System.out.print("�� ����� ������������� ��������!");	
	x = ourlab1.test(x);
	}
	System.out.print("������� ����� z:\n");
    double z = 0;
    z = ourlab1.test(z);

	System.out.print(y*y+3*Math.sqrt(x)+z+ "\n");
	}

	System.out.print("�������:\n0-����� � ������� ����\n1-����� Hellow world\n2-������� �������:y*y + 3*sqrt(x)+ z\n");
	
	key = ourlab1.test(key);
	}
	
	
	}
	}
	
	

