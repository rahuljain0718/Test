interface person{
	                                                                                                                                                                                    
   int eat(int m,int n);	
  
}

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p= (m,n)->{ return m+n;};
		
		
		System.out.println(p.eat(2,4));
		
		
		}
		
	
}

	

	
