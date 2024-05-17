package nithin.java;

public class Functionality {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String verify()
	{
		if(age>=18)
			return "Eligible for Vote";
		else
			return "Not Eligible";
	}

}
