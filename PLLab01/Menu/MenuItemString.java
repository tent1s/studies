import javax.xml.bind.ValidationException;


public class MenuItemString extends MenuItem{
	public MenuItemString()
	{
		_title = "Строки";
	}
	
	
	String str1NEW =null;
	String str2NEW =null;
	public void execute() throws ValidationException
	{
		String str1=Input.getString("первую строку");
		String str2=Input.getString("вторую строку");
		Output.println("Строгое сравнение:");
		if (str1.equals(str2)) {
			Output.println("Строки совпадают");
			}else{Output.println("Строки не совпадают");                                      
		}
        registr(str1,str2);
        Output.println("Мягкое сравнение:");
		if (str1NEW.equalsIgnoreCase(str2NEW) == false) {
			Output.println("Строки не совпадают");
			}else{Output.println("Строки совпадают");
		}
        StringValidator.checkPerevert(str1NEW,str2NEW,"Строка №1 перевертышь к строк №2","Строка №1 НЕ перевертышь к строк №2");
        StringValidator.checkPattern(str1NEW,"[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "Строка №1 email", "Строка №1 НЕ email");
        StringValidator.checkPattern(str2NEW,"[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "Строка №2 email", "Строка №2 НЕ email");
        StringValidator.checkPattern(str1NEW,"^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "Строка №1 номер телефона", "Строка №1 НЕ номер телефона");
        StringValidator.checkPattern(str2NEW,"^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "Строка №2 номер телефона", "Строка №2 НЕ номер телефона");
        StringValidator.checkPattern(str1NEW,"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "Строка №1 IP", "Строка №1 НЕ IP");
        StringValidator.checkPattern(str2NEW,"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "Строка №2 IP", "Строка №2 НЕ IP");
	}		
	public void registr(String str1, String str2) {
	    str1NEW=lower(str1);
		Output.println(str1NEW);
	    str2NEW=lower(str2);
		Output.println(str2NEW);
	}
	public String apper(String str) {
		String strUpper = str.toUpperCase();
	    String str1NEWU = strUpper.trim().replaceAll("\\s+", " ");
		return str1NEWU;
	}
	public String lower(String str1) {
		String strUpper = str1.toLowerCase();
	    String str1NEWU = strUpper.trim().replaceAll("\\s+", " ");
		return str1NEWU;
	}
}
