public class Toast extends Food {
	
	private static final String ToastName = null;

	public Toast(String ToastName) {
		
		super(ToastName);
		
	}
	
	String make() {
		
	    	System.out.println("Toast has been made");
		return ToastName;
    	
	}

}
