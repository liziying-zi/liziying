/**
*Description:Multiplication to my friend
*Author:     liziying
*Data:       2019-9-16
*/
public class Multiplication{
     /*the name of */
/**
*Description:Multiplication to my friend
*Param:      i,j
*return:    [NULL]
*Date:      2019-9-16
*/
public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <i+1; j++) {
				if (j*i<10&&j!=1) {
					System.out.print(j+"*"+i+"= "+j*i+" ");
				}
				else {
					System.out.print(j+"*"+i+"="+j*i+" ");
				}
			}
			System.out.println("");
		}
	}
}