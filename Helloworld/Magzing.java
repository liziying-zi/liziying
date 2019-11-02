/**
*Description:Magzing to my friend
*Author:     liziying
*Data:       2019-11-2
*/
package book;

/**
 * @author 86185
 * Magzing
 */
public class Magzing implements Reading {

	/* (non-Javadoc)
	 * @see book.Reading#Info()
	 */
	int price,pages;
	String publish_time;
	//构造方法
	public Magzing(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	public void Magazing(int price,int pages,String publish_time) {
		this.pages = pages;
		this.price = price;
		this.publish_time = publish_time;
	}
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a magazine, which has " + pages + " pages,"+" costs " + price + " yuan, and publish once every " + publish_time +"." );
	}

}
