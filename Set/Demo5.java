package cn.itcast.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet添加自定义元素：
 * 
 * TreeSet要注意细节：
 * 		1.往TreeSet里面添加元素时，如果元素本身具备了自然顺序的特性，会按照元素的自然顺序特性进行输出
 * 		2.如果往TreeSet里面添加元素时，如果元素本身不具备自然顺序特性，那么该元素所属的类必须要实现Comparable接口
 * 		把元素的比较规则定义在compareTo(Object obj)方法上
 * 		3.如果比较元素时compareTo返回0时，那么该元素被视为重复元素，不允许添加。
 * 			(注意：TreeSet,hashCode与equals方法是没有任何关系的)
 * 		4.往TreeSet添加元素的时候，如果该元素不具备自然顺序的特性，而元素所属的类也没有实现Comparable接口，那么必须要
 * 			在创建TreeSet的时候传入一个比较器
 * 		5.往TreeSet添加元素的时候，如果该元素不具备自然顺序的特性，而元素所属的类已经实现了comparable接口，在创建TreeSet
 * 			对象的时候也传入了比较器，那么是以比较器的比较规则优先使用
 * 
 * 
 * 		二叉树：如果三个结点没有形成叉，那么会自动调整结点，这样做的目的是为了减少比较次数
 * 
 * 	如何自定义定义一个比较器：自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可
 * 		自定义比较器的格式：
 * 			class 类名  implements ComParator{
 * 
 * 
			}
	推荐使用：比较器（Comparator）
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
		return "{编号："+this.id+" 姓名："+this.name+"  薪水："+this.salary+"}";
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
		t.add(new Emp(110,"美美",100));
		t.add(new Emp(111,"熙来",300));
		t.add(new Emp(112,"伯雄",500));
		t.add(new Emp(113,"才厚",400));
		Iterator it = t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
