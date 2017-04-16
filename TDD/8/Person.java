
public class Person {
	int id;	
	static int countPerson=1;
	String name;
	int age;
	String gender;
	
	private Person(int id,String name,int age,String gender)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	
	public String toString()
	{
		return new String(id+name+age+gender);
	}
	
	public static Person getInstancePerson(String name,int age,String gender){
		
		if(age>=0&&age<=200&&gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")){
			return new Person(countPerson++,name,age,gender);
			
		}
		
			return null;			
	}
}
