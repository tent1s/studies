package lab;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.io.IOException;

public class lab2 extends main{
	
	    public static long getDayRange(Date d1, Date d2) throws ParseException, IOException 
	    {
		    while((d2.getTime()-d1.getTime())/(1000*60*60*24)<=0) 
		    {
			System.out.println("Вы ввели даты в неверном порядке или число N равно 0");
			lab2();
		    }
		  return (d2.getTime()-d1.getTime())/(1000*60*60*24);
		}
	
	   public static int Formula(int n)
	   {
	      if((n > 0) && ((n & (n - 1)) == 0))
             System.out.println("YES");
          else
             System.out.println("NO");
	      return n;
	   }
	   
       public static final DateFormat dateform = new SimpleDateFormat("dd.MM.yyyy");
       private static final String Date = null;	
       static public void lab2() throws ParseException, IOException 
       {
	       Scanner in = new Scanner(System.in);
	       System.out.println("Введите первую дату");
	       Date date1 = get_date(in);
           System.out.println("Введите вторую дату");
	       Date date2 = get_date(in);
	       System.out.println("Число дней:"+getDayRange(date1,date2));
	       int n=0;
	       n=(int) (getDayRange(date1,date2));
	       Formula(n);
        }
        

        private static boolean isValid(String date)
        {
            try {
              return dateform.format(dateform.parse(date)).equals(date);
                }catch (ParseException ex)
            {
              return false;
            }
        }
        
        private static Date get_date(Scanner in)
        {
          String as = in.nextLine();
             while(!isValid(as))
             { 
                System.out.println("Введите дату в верном формате!");
                as = in.nextLine();
             }
          try {
          return dateform.parse(as);
          } catch (ParseException ex)
             {
          ex.printStackTrace();
          return new Date();
             }
         }
}


