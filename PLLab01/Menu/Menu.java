import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private static List<MenuItem> _menuItems = null;
	
	public static List<MenuItem> getMenuItems()
	{
		if (_menuItems == null)
		{
			_menuItems = new ArrayList<MenuItem>();
			_menuItems.add(new MenuItemExit());
			_menuItems.add(new MenuItemHelloWorld());
			_menuItems.add(new MenuItemFormula());
			_menuItems.add(new MenuItemFormulaRecurs());
			_menuItems.add(new MenuItemString());
		}
		return _menuItems;
	}
	
	public static void print()
	{
		List<MenuItem> menuItems = getMenuItems();
		Output.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Output.println("Меню:");
		for (int iMenu = 0; iMenu < menuItems.size(); iMenu++)
		{
			Output.println("  "+iMenu+": "+menuItems.get(iMenu).getTitle());
		}
		Output.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	public static MenuItem getSelectedMenuItem()
	{
		List<MenuItem> menuItems = getMenuItems();
		int iMenuItem = 0;
		while (true)
		{
			iMenuItem = Input.getInt("пункт меню");
			if ((iMenuItem < 0) || (iMenuItem >= menuItems.size()))
			{
				Output.println("ERROR: номер должен быть >=0 и <"+menuItems.size());
				continue;
			}
			
			return menuItems.get(iMenuItem);
		}
	}
}
