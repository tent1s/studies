import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class MenuItemHelloWorldTests {
	MenuItemHelloWorld menuItem = new MenuItemHelloWorld();
	
	@Test
	public void MenuItemHelloWorld_getTitle() {
		assertEquals("Hello world", menuItem.getTitle());
	}
}
