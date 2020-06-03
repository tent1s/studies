import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MenuItemExitTests {
	MenuItemExit _menuItem = new MenuItemExit();

	@Test
	public void MenuItemExit_getTitle()
	{
		assertEquals("Выход", _menuItem.getTitle());
	}
}
