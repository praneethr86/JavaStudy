package nullObjectPattern;

public class CustomerFactory {

	public static final String[] names = {"Jane", "John", "Jacob"};
	
	public static AbstractCustomer getCustomer(String name){
		
		//if name present, return realCustomer, else return nullCustomer
		for(int i=0; i<names.length;i++){
			if(names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		
		return new NullCustomer();
		
	}
	
}
