package LIST;
import java.util.*;


public class arraylist1encap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n,i,age;
String name;
System.out.println("enter the size");
n=s.nextInt();
ArrayList al=new ArrayList();
employee []emp=new employee[n];
for(i=0;i<n;i++) {
	 System.out.println("enter name");
	 name=s.next();
	 System.out.println("enter age");
	 age=s.nextInt();
	 emp[i]=new employee();
	 emp[i].setAge(age);
	 emp[i].setName(name);
	 al.add(emp[i]);
	 
}

System.out.println("");
	}

}
