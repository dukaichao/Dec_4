package cn.itcast.Set;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 需求：要求键盘输入密码和账号，不能出现重复账号
 */
class User{
	int id;
	String psword;
	public User(int id,String psword) {
		this.id = id;
		this.psword = psword;
	}

	public boolean equals(Object obj) {
		User u =(User)obj;
		return this.id == u.id;
	}
	
	public int hashCode() {
		
		return this.id;
	}
	
	public String toString() {
		
		return "{ "+id+","+psword+" }";
	}
}
public class Demo3 {
	public static void main(String[] args) {
		HashSet<User> h = new HashSet<User>();
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("请输入账号：");
			int id = s.nextInt();
			User u = new User(id,null);
			if(h.contains(u)) {
				System.out.println("该账号已注册，请重新输入....");
			}
			else {
				System.out.println("请输入密码：");
				String psword = s.next();
				u = new User(id,psword);
				h.add(u);
				System.out.println(h);
			}
			
		}
		
	}
}
