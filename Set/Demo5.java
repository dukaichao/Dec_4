package cn.itcast.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet����Զ���Ԫ�أ�
 * 
 * TreeSetҪע��ϸ�ڣ�
 * 		1.��TreeSet�������Ԫ��ʱ�����Ԫ�ر���߱�����Ȼ˳������ԣ��ᰴ��Ԫ�ص���Ȼ˳�����Խ������
 * 		2.�����TreeSet�������Ԫ��ʱ�����Ԫ�ر����߱���Ȼ˳�����ԣ���ô��Ԫ�������������Ҫʵ��Comparable�ӿ�
 * 		��Ԫ�صıȽϹ�������compareTo(Object obj)������
 * 		3.����Ƚ�Ԫ��ʱcompareTo����0ʱ����ô��Ԫ�ر���Ϊ�ظ�Ԫ�أ���������ӡ�
 * 			(ע�⣺TreeSet,hashCode��equals������û���κι�ϵ��)
 * 		4.��TreeSet���Ԫ�ص�ʱ�������Ԫ�ز��߱���Ȼ˳������ԣ���Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô����Ҫ
 * 			�ڴ���TreeSet��ʱ����һ���Ƚ���
 * 		5.��TreeSet���Ԫ�ص�ʱ�������Ԫ�ز��߱���Ȼ˳������ԣ���Ԫ�����������Ѿ�ʵ����comparable�ӿڣ��ڴ���TreeSet
 * 			�����ʱ��Ҳ�����˱Ƚ�������ô���ԱȽ����ıȽϹ�������ʹ��
 * 
 * 
 * 		������������������û���γɲ棬��ô���Զ�������㣬��������Ŀ����Ϊ�˼��ٱȽϴ���
 * 
 * 	����Զ��嶨��һ���Ƚ������Զ���һ����ʵ��Comparator�ӿڼ��ɣ���Ԫ����Ԫ��֮��ıȽϹ�������compare�����ڼ���
 * 		�Զ���Ƚ����ĸ�ʽ��
 * 			class ����  implements ComParator{
 * 
 * 
			}
	�Ƽ�ʹ�ã��Ƚ�����Comparator��
 */
class Emp{//
	int id;
	String name;
	int salary;
	public Emp(int id,String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "{��ţ�"+this.id+" ������"+this.name+"  нˮ��"+this.salary+"}";
	}
	/*@Override
	public int compareTo(Object obj) {
		Emp e = (Emp)obj;
		System.out.println(this.name+" compare "+e.name);
		return this.salary - e.salary;
	}*/
	
}
class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		return e1.salary - e2.salary;
	}
	
}
public class Demo5 {
	public static void main(String[] args) {
		MyComparator mc = new MyComparator();
		TreeSet<Emp> t = new TreeSet<Emp>(mc);
		t.add(new Emp(110,"����",100));
		t.add(new Emp(111,"����",300));
		t.add(new Emp(112,"����",500));
		t.add(new Emp(113,"�ź�",400));
		Iterator it = t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
