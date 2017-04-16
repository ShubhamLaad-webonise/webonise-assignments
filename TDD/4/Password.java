

public class Password {
public boolean isValid(String password){
	if(password.length()<8)
		return false;
	//password should contain 1special char, 1 number and 1 char
	return password.matches("^(?=.*[0-9])(?=.*[-_!@#$%^&*])(?=.*[A-Za-z])[a-zA-Z0-9-_!@#$%^&*]*$");
}
}
