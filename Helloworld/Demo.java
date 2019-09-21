/**
*Description:Demo to my friend
*Author:     liziying
*Data:       2019-9-21
*/
public class Demo{
/**
*Description:Demo to my friend
*Param:      count
*return:    count
*Date:      2019-9-21
*/
    public static void main(String[] arge){
	  System.out.println("Bellow is the function of Demo");
	  Demo();
   }
    public static void Demo(){
	  System.out.println("say hello!"+count());
	}           
    public static int count(){
	  //定义整型变量count
	  int count=10;
	  count*=count+2;
	  count/=100;
	  count++;
	  return count;//返回值
    }
}
