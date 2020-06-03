import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.xml.bind.ValidationException;

public class StringValidatorTests  {
	StringValidator ExcItem = new StringValidator();
	@Test
	public void isPatternEmail() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("dsdd@ru","[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "������ �1 email", "������ �1 �� email"));
		assertEquals("������ �1 �� email", thrown.getMessage());
	}
	@Test
	public void isPatternEmail_OK() throws ValidationException {
	     StringValidator.isPattern("dsdd@dfdfdf.ru","[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+", "������ �1 email", "������ �1 �� email");
	}
	@Test
	public void isPatternIP() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("124.4344.354.43","(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}", "������ �1 IP", "������ �1 �� IP"));
		assertEquals("������ �1 �� IP", thrown.getMessage());
	}
	@Test
	public void isPatternPhone() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPattern("85494��","^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", "������ �2 ����� ��������", "������ �2 �� ����� ��������"));
		assertEquals("������ �2 �� ����� ��������", thrown.getMessage());
	}
	@Test
	public void isPerevert() {
		Throwable thrown = assertThrows(ValidationException.class, () -> StringValidator.isPerevert("gggg","85494��", "������ �1 ����������� � ����� �2","������ �1 �� ����������� � ����� �2"));
		assertEquals("������ �1 �� ����������� � ����� �2", thrown.getMessage());
	}
	@Test
	public void isPerevert_OK() throws ValidationException {
	    StringValidator.isPerevert("ghj","jhg", "������ �1 ����������� � ����� �2","������ �1 �� ����������� � ����� �2");
	}
}  