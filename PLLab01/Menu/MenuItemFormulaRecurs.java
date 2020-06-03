import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class MenuItemFormulaRecurs extends MenuItem {
	
	public MenuItemFormulaRecurs()
	{
		_title = "������� ����������� �������";
	}
	
	public void execute()
	{
          LocalDate m1[]=scan_date("������ ����������");
          LocalDate s1=m1[0];
          LocalDate f1=m1[1];
          LocalDate m2[]=scan_date("������ ����������");
          LocalDate s2=m2[0];
          LocalDate f2=m2[1];
          if (getPeriod(s1, f1, s2, f2).getDays()<0) {
        	  Output.println("�������� ���� ���");
          }
          else {
        	  int t =getPeriod(s1, f1, s2, f2).getDays()+1;
        	  Output.println("�����������:"+ t);
        	  Output.println(Formula(t));
          }

	}
	
	public String Formula(int n)
    {
	      if((n > 0) && ((n & (n - 1)) == 0))
          {return "YES";}
    else
	      {return "NO";}
    }
	
	public LocalDate convertToLocalDateViaDate(Date dateToConvert) {
     return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
	}
	
	public Period getPeriod(LocalDate s1, LocalDate f1, LocalDate s2, LocalDate f2) {
        LocalDate start = s1.isAfter(s2) ? s1 : s2;
        LocalDate end = f1.isBefore(f2) ? f1 : f2;
        return Period.between(start, end);
	}
	
	 private LocalDate[] scan_date(String varName)  {
	    Output.println("������� "+varName+": ");
	 	Date d1 = Input.getDate("������ ����");
	 	Date d2 = Input.getDate("������ ����");
	 	LocalDate date1 =convertToLocalDateViaDate(d1);
	    LocalDate date2 = convertToLocalDateViaDate(d2);
	 	long n=date1.until(date2, ChronoUnit.DAYS);
	     while(n<0) {
	     	System.out.println(date1.until(date2, ChronoUnit.DAYS));
	          System.out.println("������ ���� ������ ��� ����� ������!");
	          d1 = Input.getDate("������ ����");
	       	  d2 = Input.getDate("������ ����");
	       	  date1 =convertToLocalDateViaDate(d1);
	          date2 = convertToLocalDateViaDate(d2);
	          n=date1.until(date2, ChronoUnit.DAYS);
          	
         }
     return new LocalDate[] {date1,date2};
    }
}