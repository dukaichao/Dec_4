package cn.itcast.Set;

import java.util.TreeSet;

/*
 * Set�ӿ�ʵ���ࣺ
 * ----------|HashSet���ײ�����HashMapʵ�ֵ�
 * 		 
 * 		hashSetʵ��ԭ��
 * 			��hashSet�������Ԫ��ʱ��hashSet���Զ�����hashCode�������õ�Ԫ�صĹ�ϣֵ��Ȼ��ͨ��Ԫ�صĹ�ϣֵ������λ������
 * 		�Ϳ��������Ԫ���ڹ�ϣ���еĴ洢λ�á�
 * 			���λ�������������
 * 				1.������Ԫ�ش洢��λ��û��Ԫ�ش��ڣ���ô���Դ��롣
 * 				2.������Ԫ�ش洢��λ����Ԫ�ش��ڣ���ô�����equals���������equals��������true���򲻿�����ӣ�
 * 			����falseʱ���������ӡ�	
 * 		hashCode������hashCodeĬ������±�ʾ�����ڴ��ַ��String���Ѿ���д��Object��hashCode����		
 * ----------|TreeSet��  ���Ԫ�ؾ߱���Ȼ˳������ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢
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
