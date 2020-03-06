package lab;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.io.IOException;

public class lab2 extends main{
	    public static final DateFormat dateform = new SimpleDateFormat("dd.MM.yyyy");
        private static final String Date = null;	
	    static public void lab2() throws ParseException, IOException 
        {
	         Scanner in = new Scanner(System.in);
	         Formula(scan_date(null, null, in));
	         Formula(scan_date(null, null, in));
        }
	    
	    
	    public static long getDayRange(Date d1, Date d2) throws ParseException, IOException 
	    {
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
                System.out.println("¬ведите дату в верном формате!");
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
        
        private static int scan_date(Date date1,Date date2, Scanner in) throws ParseException, IOException {
        	good_dayrange:
            for(;;) {
               System.out.println("¬ведите первую дату");
 	           date1 = get_date(in);
               System.out.println("¬ведите вторую дату");
 	           date2 = get_date(in);
 	           getDayRange(date1,date2);
 	             if(getDayRange(date1,date2)<=0) {
 	            	 System.out.println("ѕерва€ дата больше или равна второй!");
 	            	 }
 	             if(getDayRange(date1,date2)>0) {
 	    	     break good_dayrange;
 	       }
        }  
 	       System.out.println("„исло N:"+getDayRange(date1,date2));
 	       int n=0;
 	       n=(int) (getDayRange(date1,date2));
 	       return n;
        }
        
}


