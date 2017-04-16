
public class Email {
boolean isValid(String email)
	{
	                        //[user name can have dot]@[string and no form].[in string from][.optional]                                    
		return email.matches("^[A-Za-z0-9-_]+(\\.[A-Za-z0-9-_]+)*@[A-Za-z0-9]+(\\.[A-Za-z]+)(\\.[A-Za-z]{2,})*$");
	}
}