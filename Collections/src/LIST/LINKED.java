package LIST;
import java.util.*;
public class LINKED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter no.of students");
int n=s.nextInt();
LinkedList list=new LinkedList();
for(int i=0;i<n;i++)	
{System.out.println("enter your name");
String name=s.next();
System.out.println("enter roll number");
int rn=s.nextInt();
System.out.println("marks in maths");
int math=s.nextInt();
System.out.println("marks in biology");
int bio=s.nextInt();
System.out.println("marks in english");
int eng=s.nextInt();
list.add(name);
list.add(rn);
list.add(math);
list.add(bio);
list.add(eng);
}System.out.println(list);
System.out.println("list size : "+list.size());
System.out.println("list is empty(true or false): "+list.isEmpty());
list.clear();
System.out.println(list);
System.out.println("list is empty(true or false): "+list.isEmpty());

	}
}
