package cn.itcast.Set;

import java.util.Iterator;
import java.util.TreeSet;


/*
 * 需求：
 	 将String s = "2 5 10 8 7 1 9"进行排序
 */
public class Demo7 {
	public static void main(String[] args) {
		TreeSet h = new TreeSet();
		String s = "2 15 18 77 10 9";
		String[] data = s.split(" ");
		System.out.println(data.length);
		for(int i =0;i<data.length;i++) {
			System.out.print(data[i]+",");
		}
		for(int i = 0;i<data.length;i++) {
				h.add(Integer.parseInt( data[i] ));   //字符串转int类型需要使用Integer.parseInt方法
		}
		System.out.println(h);
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
