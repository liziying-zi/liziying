/**
*Description:Pyramid to my friend
*Author:     liziying
*Data:       2019-9-16
*/
import java.util.Scanner;
public class Pyramid{
     /*the name of */
/**
*Description:Pyramid to my friend
*Param:      j,k,i,n
*return:    [NULL]
*Date:      2019-9-16
*/
    public static void main(String[] args){
	    int k;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Input n");
	    int n=scan.nextInt();
        for(int i=1;i<=n;i++){
	    for(int j=1;j<=n-i;j++){
	       System.out.print(" "); 
	   }
	    for(k=1;k<=2*i-1;k++){
	   System.out.print("$"); 
	   }
	   System.out.println(); 
	   }
}
}