package MAP;
import java.util.*;
import java.util.Map.Entry;

import LIST.Employee1;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int age,n;
String name;
System.out.println("enter size");
n=s.nextInt();
Map<Integer,Employee1> map=new HashMap<Integer,Employee1>();
Employee1[]emp=new Employee1[n];
for(int i=0;i<n;i++) {
	System.out.println("enter name");
	name=s.next();
	System.out.println("enter age");
	age=s.nextInt();
	emp[i]=new Employee1();
	emp[i].setAge(age);
	emp[i].setName(name);
	map.put(i, emp[i]);
	
			
}for(Map.Entry<Integer,Employee1>ll:map.entrySet())
{
	
	int key=ll.getKey();
	Employee1 e=ll.getValue();
	System.out.println((key+1)+" "+e.getName()+" "+e.getAge());
}s.close();
	}

}
