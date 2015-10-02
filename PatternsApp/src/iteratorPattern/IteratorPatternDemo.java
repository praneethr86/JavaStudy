package iteratorPattern;

public class IteratorPatternDemo {

	public static void main(String[] args){
		NameRepository namesRespository = new NameRepository();
		
		for(Iterator iter = namesRespository.getIterator(); 
				iter.hasNext();){
			String name = (String)iter.next();
			System.out.println(name);
		}
	}
	
}
