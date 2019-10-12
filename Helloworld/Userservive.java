/**
 * @author Administrator
 * @Date 2019-10-12 
 * Userservive
 */
package com.google.user;

/**
 * @author Administrator
 * @Date 2019-10-12 
 * made by myself
 */
//用户接口
public interface Userservive {
    //根据用户和密码实现登陆
	//0-用户不存在，1-登录成功，2-密码错误，3-登录异常
	public int login(User user);
	
	//注册
	public int register(User user);
}
    
