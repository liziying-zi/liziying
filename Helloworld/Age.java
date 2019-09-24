/**
*Description:Age to my friend
*Author:     liziying
*Data:       2019-9-23
*/
import java.util.Scanner;
public class Age{	
/**
*Description:Age to my friend
*Param:      age
*return:     break 
*Date:      2019-9-23
*/
	public static void main(String[] args){		
	     Scanner scan = new Scanner(System.in);
		 System.out.print("input num:");
		 int age =scan.nextInt();
		 age/=15;
		 switch(age){
			 case 0:
			     System.out.println("young!");
		     	 break;
			 case 1:
			 	 System.out.println("elder!");
				 break;
		 }
	
	}				  
	}