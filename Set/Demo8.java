package cn.itcast.Set;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable{
	String name;
	int id;
	int alimony;
	public Student(String name, int id, int alimony) {
		super();
		this.name = name;
		this.id = id;
		this.alimony = alimony;
	}
	public int compareTo(Object obj) {
		Student s = (Student)obj;
		return this.id-s.id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{������"+this.name+"�� �����ţ�"+this.id+", �����: "+this.alimony+"}";
	}
}
class MyComparator1 implements Comparator{

	
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.alimony-s2.alimony;
	}
	
}
public class Demo8{
	public static void main(String[] args) {
		MyComparator1 mc1 = new MyComparator1();
		TreeSet<Student> tree = new TreeSet<Student>(mc1);
		tree.add(new Student("����",10011,1000));
		tree.add(new Student("����",10015,5000));
		tree.add(new Student("�ź�",0,0));
		tree.add(new Student("����",10012,4000));
		tree.add(new Student("����",10016,4500));
		tree.add(new Student("�ƻ�",10014,3000));
		System.out.println(tree);
	}
}
