/**
*Description:SayHello to my friend
*Author:     liziying
*Data:       2019-9-13
*/
public class SayHello{
/**
*Description:SayHello to my friend
*Param:      i,sum
*return:     sum 
*Date:      2019-9-13
*/
    public static void main(String[] arge){
	     System.out.println("Bellow is the function of sayhello");
	     Sayhello();
   }
    public static void Sayhello(){
		System.out.println("say hello!"+Sum());
	}           
    public static int Sum(){
		int sum=0;//sum 初始化
		for(int i=1;i<=100;i++){
               sum =sum +i;	
	}
    return sum;
    }
}
