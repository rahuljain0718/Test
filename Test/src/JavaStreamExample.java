import java.util.stream.Collectors;
import java.util.*;
class Product{  
    int id;  
    String name;  
    float price;  
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
    	
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Dell Laptop",28000));  
        productsList.add(new Product(5,"HP Laptop",90000));  
        productsList.stream().filter(p -> p.price > 10000)// filtering data  
                                     .map(p->p.price+2)        // fetching price  
                                     .collect(Collectors.toList())
                                     .forEach(System.out::println); // collecting as list  
       // Product p=productsList.stream().reduce((a,b)->a.price>b.price?a:b).get();
        //System.out.println(p.id+p.name+p.price);
        //Optional<Product> p=productsList.stream().sorted(Comparator.comparing(Product::getPrice)).skip(1).findFirst();
       
           Map<String,Long>j=productsList.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
        // Map<Float, Long>m=productsList.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.counting()));
        // double avg=productsList.stream().mapToInt(Product::price).average().orElse(0);
         j.forEach((name,count)->{System.out.println(name+" "+count);
        
        
    });
    }  
}  
