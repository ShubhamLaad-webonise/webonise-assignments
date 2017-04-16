import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IFSC {

	private Pattern IFSCCodePattern=Pattern.compile("^[A-Z]{4}[0][0-9|A-Z]{6}$");
	public boolean isValid(String ifscCode)
	{
		Matcher ifscMatcher =IFSCCodePattern.matcher(ifscCode);
		return (ifscMatcher.matches()?true:false);
	}

}