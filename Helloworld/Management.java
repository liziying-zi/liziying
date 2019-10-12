/**
 * @author Administrator
 * @Date 2019-10-12 
 * Management
 */
package com.google.main;

/**
 * @author Administrator
 * @Date 2019-10-12 
 */
import java.util.Scanner;//只把util包下的Scanner类导入到程序中

import com.google.user.User;
import com.google.user.UserServicelmpl;
public class Management {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10;

		System.out.println("Please make the choose below:1 login, 2 register 3 forget password, 4 exit");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			UserServicelmpl userServicelmpl = new UserServicelmpl();
			User user = new User(); //用实现类来指向父类的接口
			System.out.println("Please input username:");
			user.setUsername(scanner.next());
			System.out.println("Please input password:");
			user.setUserpassword(scanner.next());
			result = userServicelmpl.login(user);
			break;

		default:
			System.out.println(result);
			break;
		}
	}

}
