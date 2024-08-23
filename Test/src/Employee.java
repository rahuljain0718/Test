

public class Employee{
	
	public void m1() {
		m2();
		
	}
   
    public void m2() {
		m3();
		
	} 
    public void m3() {
	System.out.println(10/0);
	
    }
	public static void main(String[] args) {
		try {
			new Employee().m1();
		}
		
				finally{
			System.out.println("fr");
		}
		
		
	

}
}
