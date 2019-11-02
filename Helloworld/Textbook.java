/**
 * 
 */
package book;

/**
 * @author 86185
 *
 */
public class Textbook implements Reading {

	/* (non-Javadoc)
	 * @see book.Reading#Info()
	 */
	
	String applicable_object;
	int price,pages;
	public Textbook(int pages, int price, String applicable_object) {
		this.pages = pages;
		this.price = price;
		this.applicable_object = applicable_object;
	}
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a textbook, which has " + pages + "pages, " + "costs " + price+ "yuan, and applicable for" + applicable_object + ". ");
	}

}
