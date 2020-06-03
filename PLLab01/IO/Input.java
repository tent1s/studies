import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input {
	protected static Scanner _scanner = null;
	public static final DateFormat dateform = new SimpleDateFormat("dd.MM.yyyy");	
	public static Scanner getScanner()
	{
		if (_scanner == null)
		{
			_scanner = new Scanner(System.in);
		}
		return _scanner;
	}
	
	public static int getInt(String varName)
	{
		Scanner scan = getScanner();
		Output.print("������� "+varName+": ");
		while(!scan.hasNextInt())
		{
			scan.nextLine();
			Output.println("ERROR: ������� �������� � ���������� �������!");
			Output.print("������� "+varName+": ");
		}
		
		return scan.nextInt();
	}

	static double getDouble(String varName) {
		Scanner scan = getScanner();
		Output.print("������� "+varName+": ");
		  boolean mainC = false;
		  while (mainC == false) {
		    if (!scan.hasNextInt()) {
		      scan.next();
		      Output.println("ERROR: ������� �������� � ���������� �������! ");
		      Output.print("������� "+varName+": ");
		    }else {
		      mainC = true;
		    }
		 }
		 return scan.nextDouble();
	}
	
    static boolean isValidDate(String date)
    {
        try {
          return dateform.format(dateform.parse(date)).equals(date);
            }catch (ParseException ex)
        {
          return false;
        }
    }
	
	  static Date getDate(String varName)
      {
		 Output.print("������� "+varName+": ");
		 Scanner in = getScanner();
         String as = in.nextLine();
           while(!isValidDate(as))
           {  
        	  as = in.nextLine();
        	  if(!isValidDate(as)) { Output.println("������� ���� � ������ �������!");}
           }
        try {
        return dateform.parse(as);
        } catch (ParseException ex)
           {
        ex.printStackTrace();
        return new Date();
           }
       }
	  
	  public static String getString(String varName){
		  Scanner in = new Scanner(System.in);
		  Output.print("������� "+varName+": ");
		  return in.nextLine();
	  }
}
