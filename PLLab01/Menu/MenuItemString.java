import javax.xml.bind.ValidationException;


public class MenuItemString extends MenuItem{
	public MenuItemString()
	{
		_title = "������";
	}
	
	
	String str1NEW =null;
	String str2NEW =null;
	public void execute() throws ValidationException
	{
		String str1=Input.getString("������ ������");
		String str2=Input.getString("������ ������");
		Output.println("������� ���������:");
		if (str1.equals(str2)) {
			Output.println("������ ���������");
			}else{Output.println("������ �� ���������");                                      
		}
        registr(str1,str2);
        Output.println("������ ���������:");
		if (str1NEW.equalsIgnoreCase(str2NEW) == false) {
			Output.println("������ �� ���������");
			}else{Output.println("������ ���������");
		}
        StringValidator.checkPerevert(str1NEW,str2NEW,"������ �1 ����������� � ����� �2","������ �1 �� ����������� � ����� �2");
        StringValidator.checkPattern(str1NEW,"[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "������ �1 email", "������ �1 �� email");
        StringValidator.checkPattern(str2NEW,"[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "������ �2 email", "������ �2 �� email");
        StringValidator.checkPattern(str1NEW,"^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "������ �1 ����� ��������", "������ �1 �� ����� ��������");
        StringValidator.checkPattern(str2NEW,"^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "������ �2 ����� ��������", "������ �2 �� ����� ��������");
        StringValidator.checkPattern(str1NEW,"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "������ �1 IP", "������ �1 �� IP");
        StringValidator.checkPattern(str2NEW,"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "������ �2 IP", "������ �2 �� IP");
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
