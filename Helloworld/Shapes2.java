/**
 *Description:Shapes2 to my friend
 *Author:     liziying
 *Data:       2019-11-2
 */
package Shape;

/**
 * ��̬
 */
@SuppressWarnings("unused")
public class Shapes2 {

	public static void randShape() {
		// �����಻������ʵ��
		switch ((int) (Math.random() * 3)) {
		case 0:
			Circle circle = new Circle();
			circle.draw();
			circle.erase();
			break;
		case 1:
			Square square = new Square();
			square.draw();
			square.erase();
			break;
		case 2:
			Triangle triangle = new Triangle();
			triangle.draw();
			triangle.erase();
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randShape();
	}

}
