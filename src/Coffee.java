public class Coffee extends Drink {
	
    private static final String CoffeeName = null;

	public Coffee(String CoffeeName) {
		
		super(CoffeeName);
		
	}
    
    String make() {
		
    		System.out.println("Coffee has been made");
    	return CoffeeName;
    	
	}

}
