package cn.itcast.Set;

import java.util.HashSet;

/*
 * Set接口实现类：
 * ----------|HashSet：底层是用HashMap实现的
 * 		 
 * 		hashSet实现原理：
 * 			往hashSet里面添加元素时，hashSet会自动调用hashCode方法，得到元素的哈希值，然后通过元素的哈希值进过移位等运算
 * 		就可以算出该元素在哈希表中的存储位置。
 * 			算出位置有两种情况：
 * 				1.如果算出元素存储的位置没有元素存在，那么可以存入。
 * 				2.如果算出元素存储的位置有元素存在，那么会调用equals方法，如果equals方法返回true，则不可以添加，
 * 			返回false时，则可以添加。	
 * 		hashCode方法：hashCode默认情况下表示的是内存地址，String类已经重写了Object的hashCode方法		
 * ----------|TreeSet：
 * 	
 */

class Preson{
	String name;
	int age;
	public Preson(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		
		return "{ 名字："+this.name+" 年龄："+this.age+" }";
	}
	
	public int hashCode() {
		System.out.println("hashCode被调用了");
		return this.age;
	}
	public boolean equals(Object obj) {
		System.out.println("equals被调用了");
		Preson p = (Preson) obj;
		return this.age == p.age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		HashSet<Preson> h = new HashSet<Preson>();
		h.add(new Preson("张三",18));
		h.add(new Preson("李四",28));
		h.add(new Preson("王五",20));
		System.out.println("添加成功吗？"+h.add(new Preson("张三",18)));
		System.out.println("集合元素为："+h);
		
	}
}
