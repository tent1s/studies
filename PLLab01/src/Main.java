import javax.xml.bind.ValidationException;

public class Main {	
	
	public static void main(String[] args) throws ValidationException
	{
		while(true)
		{
			Menu.print();
			MenuItem menuItem = Menu.getSelectedMenuItem();
			menuItem.execute();
		}
	}
}