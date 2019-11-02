/**
*Description:Journal to my friend
*Author:     liziying
*Data:       2019-11-2
*/
package book;
/**
 * @author 86185
 * Journal
 */
public class Journal implements Reading {
	int price,pages;
	String publishing_time;
	//构造方法
	public Journal(int pages, int price, String publishing_time) {
		this.pages = pages;
   	    this.price = price;
   	    this.publishing_time =publishing_time;
	}
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a Journal, which has " + pages + " pages,"+"costs"+price+"yuan,and pubish once every"+publishing_time+".");
	}

}
