
public class Student {

	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String city;
	int age;
	
	
	
	Student(String name,String city,int age){
		this.name=name;
		this.city=city;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Name: "+name+" "+"city: "+city+" "+"age: "+age+"\n";
	
	}
}