package cn.itcast.Set;

import java.util.TreeSet;

/*
 * TreeSet 存储原理：底层是使用红黑树数据结构实现    存储规则：左小右大
	TreeSet是可以对字符串进行比较的，因为String类实现了Comparable接口
	字符串比较规则：
		1.可以找到对应不同字符，比较的就是对应位置上的字符
		2.对应位置字符一样，比较的是字符串的长度
 */
public class Demo6 {
	public static void main(String[] args) {
	/*	TreeSet t = new TreeSet();
		t.add("adb");
		t.add("adA");
		t.add("ada");
		t.add(".?.?.?。/.");
		System.out.println(t);*/
		System.out.println("abd".compareTo("abc"));
	}
}
