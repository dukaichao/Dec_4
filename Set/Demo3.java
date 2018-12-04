package cn.itcast.Set;

import java.util.HashSet;
import java.util.Scanner;

/*
 * ����Ҫ���������������˺ţ����ܳ����ظ��˺�
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
			System.out.println("�������˺ţ�");
			int id = s.nextInt();
			User u = new User(id,null);
			if(h.contains(u)) {
				System.out.println("���˺���ע�ᣬ����������....");
			}
			else {
				System.out.println("���������룺");
				String psword = s.next();
				u = new User(id,psword);
				h.add(u);
				System.out.println(h);
			}
			
		}
		
	}
}
