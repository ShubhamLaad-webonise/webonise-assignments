
public class Grade{
	String getGrade(double marks)
	{
		if(marks<0)
			return null;
		return ((marks>=70)?"A":(marks>=60)?"B":(marks>=50)?"C":(marks>=40)?"D":"F");
	}
}