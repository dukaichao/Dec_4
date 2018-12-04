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
		return "{姓名："+this.name+"， 监狱号："+this.id+", 生活费: "+this.alimony+"}";
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
		tree.add(new Student("美美",10011,1000));
		tree.add(new Student("伯雄",10015,5000));
		tree.add(new Student("才厚",0,0));
		tree.add(new Student("永康",10012,4000));
		tree.add(new Student("熙来",10016,4500));
		tree.add(new Student("计划",10014,3000));
		System.out.println(tree);
	}
}
