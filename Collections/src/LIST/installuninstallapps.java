
package LIST;
import java.util.*;
public class installuninstallapps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
ArrayList list=new ArrayList();
int n;String name;
do{
System.out.println("1.Display installed applications\n2.Install an application\n3.Uninstall an application\n4.Quit\n");
	n=s.nextInt();
	if(n==1) {
		if(list.isEmpty()) {
			System.out.println("There is no application installed.");
			
		}else {
			Iterator itr=list.iterator();
			int j=1;
			while(itr.hasNext()) {
				System.out.println(j+")"+itr.next());
			}
		}
	}
		else if(n==2) {
			System.out.println("Enter Name:");
			name=s.next();
			if(list.contains(name))
			{
				System.out.println("This app is already installed");
			}
			else {
			list.add(name);
			System.out.println("App installed Successfully");
			}
		
		
	}else if(n==3) {
		if(list.isEmpty()) {
			System.out.println("There is no application installed.");
		}else {
		Iterator itr=list.iterator();
		int k=1;
		while(itr.hasNext()) {
			System.out.println(k+")"+itr.next());
			k++;
		}
		System.out.println("enter app number");
		int m=s.nextInt();
		list.remove(m-1);
		System.out.println("App is uninstalled successfully");}
	}else if(n==4) {
		exit();
	}
	else if(n>4||n<1) {
		System.out.println("invalid input");
	}
	
	


}while(n==1||n==2||n==3);}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}}