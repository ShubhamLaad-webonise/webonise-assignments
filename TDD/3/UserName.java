
public class UserName {

	boolean isValid(String userName)
	{
		if(userName.length()<5)
			return false;
		//password min 5 char long and should start with a char and can have multiple special char 
		return userName.matches("^[a-zA-Z][a-zA-Z_,.-]*$");
	}
}