package cn.itcast.Set;

import java.util.TreeSet;

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
 * ----------|TreeSet：  如果元素具备自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储
 * 	
 */
public class Demo4 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(15);
		t.add(13);
		t.add(110);
		t.add(101);
		System.out.println(t);
	}
}
