import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MenuItemFormulaTests {
	 
	MenuItemFormula menuItem = new MenuItemFormula();
		
	@Test
	public void MenuItemFormula_getTitle() 
	{
		assertEquals("Вычисление формулы y*y + 3*sqrt(x)+ z:", menuItem.getTitle());
	}
	
	@Test
	public void MenuItemFormula_calc()
	{
		assertEquals(5.0,  menuItem.calc(1.0,   1.0,  1.0));
	}
}
