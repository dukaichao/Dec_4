package cn.itcast.Set;

import java.util.HashSet;
import java.util.Set;

/*
 *   Set�ӿڣ�  ����(ָSet����û������ֵ)�������ظ�
 *   
 */
public class Demo1 {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("����");
		s.add("����");
		s.add("����");
		s.add("����");
		System.out.println("Ԫ����ӳɹ�����"+s.add("����"));
		System.out.println(s);
		
	}
}
