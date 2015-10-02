package nullObjectPattern;

public class NullPatternDemo {

	public static void main(String[] args){
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("John");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Jane");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Jacob");
		
		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
