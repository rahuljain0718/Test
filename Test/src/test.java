import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test {


	
	public static void main(String[] args) {
		
		
		//System.out.println(rev);
	      //  String[] s = new String[5];
	     //   s[2] = "Geeks Classes are coming soon";
		//Optional<String> m=Optional.ofNullable(s[1]);
		//System.out.println(m);
	/*	int n=1;
		for(int i=2;n<15;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(n+" ");
				n++;
				
			}
			System.out.println();
		}
		*/
	
		
		List<Student> am =new ArrayList<Student>();
		Student s1=new Student("Rahul", "pune", 25);
		Student s2=new Student("Pratik", "mumbai", 4);
		Student s3=new Student("pavan", "kalyan", 4);
		Student s4=new Student("nitin", "delhi", 5);
	   am.add(s1);
	   am.add(s2);
	   am.add(s3);
	   am.add(s4);
	   //System.out.println(am.get(0));
	   am.parallelStream().filter(i->i.city.equals("pune")).map(i->i.name).collect(Collectors.toList()).forEach(System.out::println);
       Student s=am.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).skip(1).findFirst().orElse(null);
       System.out.println(s.age);
	   //am.stream().forEach(System.out::println);
		//am.stream().filter(i->i=="mm").collect(Collectors.toList()).forEach(System.out::println);
	
		//List<String> k =am.stream().filter(i->i=="software developer").collect(Collectors.toList()); 
		//List<Integer> myList= new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		//myList.stream().filter(i->i.equals("Rahul")).collect(Collectors.toList()).forEach(System.out::println); 
		int k  = myList.stream().reduce(Integer.MIN_VALUE,(a,b)-> (a >= b) ? a : b);
		System.out.println(k);
	    //am.stream().filter(i->i!=2).collect(Collectors.toList()).forEach(System.out::println);
		//am.stream().filter(i->i!=2).collect(Collectors.toList()).forEach(System.out::println);
		//List<Integer> k1 = myList.stream().map(i->i+1).collect(Collectors.toList());
		
		int h=myList.stream().reduce(Integer.MIN_VALUE,(a,b)->(a>=b)?a:b);
		
		
		
		
		
		int[] a = {1,2,2,4,3,5,4};
		Arrays.sort(a);
		int l=0;
		for(int i=0;i<a.length-1;i++){
		    if(a[i]==a[i+1]){
		        
		        l=a[i];
		        break;
		    }
		}
		Arrays.stream(a).boxed().filter(i->i==i+1).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
