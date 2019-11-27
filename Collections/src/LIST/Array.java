package LIST;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
ArrayList list=new ArrayList();//arraylist class declaration
for(int i=0;i<n;i++) {
	System.out.println("enter the name");
String name=s.next();
System.out.println("enter the age");
int age=s.nextInt();
list.add(name);//add method
list.add(age);


}

System.out.println(list.get(0));//print value at index 0
list.remove(1);//remove value of arraylist list at index 1

ArrayList list1=(ArrayList) list.clone();//clone=duplicating
list1.set(1, "man");//setting value at index 4.it for updating purpose
System.out.println(list1);

Iterator itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
list.clear();//clear list
list1.removeAll(list1);
System.out.println(list);
System.out.println(list1);
	}

}
