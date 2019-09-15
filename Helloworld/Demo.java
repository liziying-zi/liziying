public class Demo{
    public static void main(String[] arge){
	  System.out.println("Bellow is the function of Demo");
	  Demo();
   }
    public static void Demo(){
		System.out.println("say hello!"+count());
	}           
    public static int count(){
	        int count=10;
			count*=count+2;
			count/=100;
			count++;
			return count;
    }
}
