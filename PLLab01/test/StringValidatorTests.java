import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.xml.bind.ValidationException;

public class StringValidatorTests  {
	StringValidator ExcItem = new StringValidator();
	@Test
	public void isPatternEmail() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("dsdd@ru","[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "Строка №1 email", "Строка №1 НЕ email"));
		assertEquals("Строка №1 НЕ email", thrown.getMessage());
	}
	@Test
	public void isPatternEmail_OK() throws ValidationException {
	     StringValidator.isPattern("dsdd@dfdfdf.ru","[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "Строка №1 email", "Строка №1 НЕ email");
	}
	@Test
	public void isPatternIP() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("124.4344.354.43","(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "Строка №1 IP", "Строка №1 НЕ IP"));
		assertEquals("Строка №1 НЕ IP", thrown.getMessage());
	}
	@Test
	public void isPatternPhone() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("85494ва","^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "Строка №2 номер телефона", "Строка №2 НЕ номер телефона"));
		assertEquals("Строка №2 НЕ номер телефона", thrown.getMessage());
	}
	@Test
	public void isPerevert() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPerevert("gggg","85494ва", "Строка №1 перевертышь к строк №2","Строка №1 НЕ перевертышь к строк №2"));
		assertEquals("Строка №1 НЕ перевертышь к строк №2", thrown.getMessage());
	}
	@Test
	public void isPerevert_OK() throws ValidationException {
	    StringValidator.isPerevert("ghj","jhg", "Строка №1 перевертышь к строк №2","Строка №1 НЕ перевертышь к строк №2");
	}
}  