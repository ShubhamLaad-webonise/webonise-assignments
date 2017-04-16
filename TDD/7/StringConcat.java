
public class StringConcat {
public String ArrayToString(String stringArray[])
{
	String concatString="";
	for(String str:stringArray){
		concatString=concatString.concat(str);
	}
	return concatString;
}
}
