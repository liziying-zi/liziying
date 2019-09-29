/**
*Description:ArrayAssignment to my friend
*Author:     liziying
*Data:       2019-9-29
*/
public class ArrayAssignment{
/**
*Description:ArrayAssignment to my friend
*Param:      int [] a1,int [] a2
*return:    int
*Date:      2019-9-29
*/
	public static void main(String[] args){
		int [] a1={1,2,3,4,5};
		int [] a2 =a1 ;
		for(int i=0;i<a2.length;++i)
			a2[i]++;
		for(int v:a1)
			System.out.println(v);
	}
     
}