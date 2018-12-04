package cn.itcast.Set;

import java.util.HashSet;
import java.util.Set;

/*
 *   Set接口：  无序(指Set里面没有索引值)，不可重复
 *   
 */
public class Demo1 {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("张三");
		s.add("李四");
		s.add("王五");
		s.add("赵六");
		System.out.println("元素添加成功了吗？"+s.add("张三"));
		System.out.println(s);
		
	}
}
