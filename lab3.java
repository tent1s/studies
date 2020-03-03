package lab;
import java.util.Scanner;
import java.util.regex.*;

public class lab3 extends main{
	public static void lab3(){
	Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
	String str2 = in.nextLine();
	if (str1.equals(str2)== false) {System.out.println("Строки не совпадают");}else {System.out.println("Строки совпадают");}
	System.out.println("[1]Привести к верхнему регистру\n[2]Привести к нижнему");
	int key= 0;
	String str1NEW=null;
	String str2NEW=null;
	key = main.testKEY(in);
		switch(key) 
		{
		case 1:
		   str1NEW=apper(str1);
	       System.out.println(str1NEW);
	       str2NEW=apper(str2);
	       System.out.println(str2NEW);
	       perevert(str1NEW,str2NEW);
	       break;
		case 2:
			str1NEW=lower(str1);
		    System.out.println(str1NEW);
		    str2NEW=lower(str2);
		    System.out.println(str2NEW);
		    perevert(str1NEW,str2NEW);
		    
			break;
		}
		if (email(str1)==false) {System.out.println("Строка №1 не email");}else {System.out.println("Строка №1 email");}
		if (email(str2)==false) {System.out.println("Строка №2 не email");}else {System.out.println("Строка №2 email");}
		if (phoneN(str1)==false) {System.out.println("Строка №1 не тел.номер");}else {System.out.println("Строка №1 тел.номер");}
		if (phoneN(str2)==false) {System.out.println("Строка №2 не тел.номер");}else {System.out.println("Строка №2 тел.номер");}
		if (IP(str1)==false) {System.out.println("Строка №1 не IP");}else {System.out.println("Строка №1 IP");}
		if (IP(str2)==false) {System.out.println("Строка №2 не IP");}else {System.out.println("Строка №2 IP");}
 }
	public static boolean perevert(String perevert1,String perevert2) {
		    for(int i = 0; i<perevert1.length()/2; i++)
		      if(perevert1.charAt(i) != perevert2.charAt(perevert2.length()-i-1))
		      {
		        System.out.println("строка 1 НЕ перевертышь к строке 2");
		        return(false);
		      }
		    System.out.println("строка 1 перевертышь к строке 2");
		    return(true);
		  }
	
	public static String apper(String str1) {
		String strUpper1 = str1.toUpperCase();
	    String str1NEWU = strUpper1.replaceAll(" ", "");
		return str1NEWU;
	}
	public static String lower(String str1) {
		String strUpper1 = str1.toLowerCase();
	    String str1NEWU = strUpper1.replaceAll(" ", "");
		return str1NEWU;
	}
	public static boolean email(String str) {
		Pattern p = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
        Matcher m = p.matcher(str);
		boolean isEmail = m.matches();
		return isEmail;
	}
	public static boolean phoneN(String str) {
		Pattern p = Pattern.compile("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
        Matcher m = p.matcher(str);
		boolean isEmail = m.matches();
		return isEmail;
	}
	public static boolean IP(String str) {
		Pattern p = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
        Matcher m = p.matcher(str);
		boolean isEmail = m.matches();
		return isEmail;
	}
}

    