public class SayHii{	
	public static void main(String[] args){		
	       SayHii sayHii = new SayHii();		
	       sayHii.sayHii(sayHii.sum());		
	}				
	public void sayHii(int sum){		
	       System.out.println("Say Hii!" +sum);	
	}			
	public int sum(){		
	       int sum = 0;	
	    for(int i = 1;i <= 100;i++){		
	        sum +=i;		
	}			
	return sum;	
	    }
	}