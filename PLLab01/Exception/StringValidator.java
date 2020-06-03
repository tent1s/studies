import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.ValidationException;

public class StringValidator {
    public static void checkPerevert(String str1, String str2, String SuccessMessage, String ErrorMessage) {
    	try {
    		isPerevert(str1,str2, SuccessMessage,ErrorMessage);
    		Output.println(SuccessMessage);
    	} catch(ValidationException e) {
    		Output.println(e.getMessage());
    	}
    }
    
	public static void isPerevert(String str1,String str2,String SuccessMessage, String ErrorMessage) throws ValidationException {
  	    if(str1.length() != str2.length()) {
  	        throw new ValidationException(ErrorMessage);
  	   }
		for(int i = 0; i<str1.length()/2; i++)
		      if(str1.charAt(i) != str2.charAt(str2.length()-i-1))
		      {
		    	  throw new ValidationException(ErrorMessage);
		      }
      }
	
    public static void isPattern(String str, String PATTERN, String SuccessMessage, String ErrorMessage) throws ValidationException {
		Pattern p = Pattern.compile(PATTERN);
        Matcher m = p.matcher(str);
		boolean isValid = m.matches();
		
		if(!isValid) {
			throw new ValidationException(ErrorMessage);
		}
    }
    
    public static void checkPattern(String str, String PATTERN, String SuccessMessage, String ErrorMessage) throws ValidationException {
    	try {
    		isPattern(str,PATTERN,SuccessMessage,ErrorMessage);
    		Output.println(SuccessMessage);
    	} catch(ValidationException e) {
    		Output.println(e.getMessage());
    	}
    }
}

