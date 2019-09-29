/**
*Description:ForArray to my friend
*Author:     liziying
*Data:       2019-9-29
*/
public class ForArray{
/**
*Description:ForArray to my friend
*Param:      int i,array[i],int value;
*return:    int
*Date:      2019-9-29
*/
	public static void main(String[] args){
		int[]array = new int[(int)(Math.random()*10)+1];
		for(int i=0;i<array.length;++i)
			array[i] = (int)(Math.random()*10);
		for(int value:array)
			System.out.println(value);
	}
     
}