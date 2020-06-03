import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MenuItemStringTests {
	
	MenuItemString menuItem = new MenuItemString();
		
	@Test
	public void MenuItemString_getTitle() 
	{
		assertEquals("������", menuItem.getTitle());
	}
	@Test
	public void MenuItemString_apper() 
	{
		assertEquals("�����", menuItem.apper("�����"));
	}
	@Test
	public void MenuItemString_lower() 
	{
		assertEquals("�����", menuItem.lower("�����"));
	}
}

