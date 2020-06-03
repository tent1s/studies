import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


import org.junit.jupiter.api.Test;

public class MenuItemFormulaRecursTests {
	MenuItemFormulaRecurs menuItem = new MenuItemFormulaRecurs();
	SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	@Test
	public void MenuItemFormula_getTitle() 
	{
		assertEquals("Рассчет рекурсивной формулы", menuItem.getTitle());
	}
	
	@Test
	public void MenuItemFormula_formula()
	{
		assertEquals("YES",  menuItem.Formula(8));
		assertEquals("NO",  menuItem.Formula(3));
		assertEquals("NO",  menuItem.Formula(-1));
	}
	@Test
	public void MenuItemFormula_dateRange() 
	{
		assertEquals(3, menuItem.getPeriod(LocalDate.of(1914, 12, 11),LocalDate.of(1914, 12, 15),LocalDate.of(1914, 12, 11),LocalDate.of(1914, 12, 13)).getDays()+1);
		assertEquals(3, menuItem.getPeriod(LocalDate.of(1914, 12, 11),LocalDate.of(1914, 12, 15),LocalDate.of(1914, 12, 10),LocalDate.of(1914, 12, 13)).getDays()+1);
		assertEquals(2, menuItem.getPeriod(LocalDate.of(1111, 11, 11),LocalDate.of(1111, 11, 12),LocalDate.of(1111, 11, 9),LocalDate.of(1111, 11, 14)).getDays()+1);
	}
	@Test
	public void MenuItemFormula_convertToLocalDateViaDate() throws ParseException 
	{
		String date1 = "01.03.2016";
	    assertEquals(LocalDate.of(2016, 03, 01), menuItem.convertToLocalDateViaDate(format.parse(date1)));
	}
	@Test
	public void MenuItemFormula_isValidDate()
	{
		assertEquals(true, Input.isValidDate("21.12.2000"));
		assertEquals(false, Input.isValidDate("fgfgfgg"));
	}
}
