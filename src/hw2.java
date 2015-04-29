public class hw2 {
	public static void main(String[] args) {
		
		int i =0;
		
		Toast Toast = new Toast("Toast");
		Coffee Coffee = new Coffee("Coffee");
		
			
			switch(args[i]) {	
			
			    case "-v": 
			    	 System.out.print("Version v1.01 ");
			    	
			         break;
			    
			    case "-h": 
				     System.out.println("Commands:");
				     System.out.println("-h: commnds list");
				     System.out.println("-v: Java  version");
				     System.out.println("-makeCoffee: make a coffee");
				     System.out.println("-makeToast: make a toast");			  
				     break;
				     
			    case "-makeCoffee":
			    {	    			
			    	 Coffee.make();
			    		break;
			    			 }
			    	     			    	 				     
			    case "-makeToast":
			    {
			    	
			    	Toast.make();
			    		break;
		    			     
			    }
			   
			    default:
			    	break;
			}
			
			}
		
					
	}


