/**
*Description:jing to my friend
*Author:     liziying
*Data:       2019-9-16
*/
import java.util.Scanner;//导入Scanner类,然后就是创建一个对象:
 
public class jing 
{
	/**
*Description:jing to my friend
*Param:      i,j,k,n
*return:    [NULL]
*Date:      2019-9-16
*/
	public static void main(String[] args) 
	{
		int i,j,k,n;
		Scanner input=new Scanner(System.in);//扫描从控制台输入的字符
		System.out.print("input n");
		n=input.nextInt();//简单文本扫描器
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(k=1;k<=2*i-1;k++)
				System.out.printf("*");
			System.out.printf("\n");
		}
	}
}
