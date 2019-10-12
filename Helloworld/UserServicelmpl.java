/**
 * @author Administrator
 * @Date 2019-10-12 
 * UserServicelmpl
 */
package com.google.user;

/**
 * @author Administrator
 * @Date 2019-10-12
 *  made by myself
 */
//调用Userservive接口
public class UserServicelmpl implements Userservive {
	 //实现用户登录的方法
	 /* (non-Javadoc)
	 * @see com.google.user.UserService#login(com.google.user.User)
	 */
	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
		int result = 3;
		if(DefaultValue.USERNAME.equals(user.getUsername())){
			if(DefaultValue.USERPASSWORD.equals(user.getUserpassword())){
				result = 1;
				System.out.println("welcome" + user.getUsername());
			}else {
				result = 2;
				System.out.println("password incorrect");
			}
		}else {
			result = 0;
			System.out.println("username incorrect");
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.google.user.UserService#register(com.google.user.User)
	 */
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
