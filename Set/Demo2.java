package cn.itcast.Set;

import java.util.HashSet;

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
 * ----------|TreeSet��
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
		
		return "{ ���֣�"+this.name+" ���䣺"+this.age+" }";
	}
	
	public int hashCode() {
		System.out.println("hashCode��������");
		return this.age;
	}
	public boolean equals(Object obj) {
		System.out.println("equals��������");
		Preson p = (Preson) obj;
		return this.age == p.age;
	}
}
public class Demo2 {
	public static void main(String[] args) {
		HashSet<Preson> h = new HashSet<Preson>();
		h.add(new Preson("����",18));
		h.add(new Preson("����",28));
		h.add(new Preson("����",20));
		System.out.println("��ӳɹ���"+h.add(new Preson("����",18)));
		System.out.println("����Ԫ��Ϊ��"+h);
		
	}
}
