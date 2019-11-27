package LIST;
import java.util.*;
public class updatemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Registration");
System.out.println("enter number of persons");
int n=s.nextInt();
ArrayList list=new ArrayList();
for(int i=0;i<n;i++) {
	System.out.println("Enter your name");
	String name=s.next();
	System.out.println("Enter your address");
	String adr=s.next();
	System.out.println("Contact Number");
	String cont=s.next();
	System.out.println("E-Mail ID");
	String mail=s.next();
	System.out.println("Enter proof type");
	String proof=s.next();
	System.out.println("Enter proof id");
	String id=s.next();
	list.add(name);
	list.add(adr);
	list.add(cont);
	list.add(mail);
	list.add(proof);
	list.add(id);
	System.out.println("Thank you for registering.Your id is "+(i+1)+"..Do you want to continue registration (y/n)?");
	String c=s.next();
	c=c.toLowerCase();
	if(c.equals("n")) {
		System.out.println("Do you want to update the email id?(yes/no)");
		String yorno=s.next();
		yorno=yorno.toLowerCase();
		if(yorno.equals("yes")) {
			System.out.println("Update Email:\nEnter new Email id");
			String mail1=s.next();		
			System.out.println("Email updated\n\nYour details of person "+(i+1)+" are as follows");
		System.out.println("Name          : "+name);
		System.out.println("Address       : "+adr);
		System.out.println("Contact Number: "+cont);
		System.out.println("E-Mail ID     : "+mail1);
		System.out.println("Proof type    : "+proof);
		System.out.println("Proof id      : "+id);
		
		}else {
			System.out.println("Name          : "+name);
			System.out.println("Address       : "+adr);
			System.out.println("Contact Number: "+cont);
			System.out.println("E-Mail ID     : "+mail);
			System.out.println("Proof type    : "+proof);
			System.out.println("Proof id      : "+id);
		}
		
	}else {
		System.out.println("Name          : "+name);
		System.out.println("Address       : "+adr);
		System.out.println("Contact Number: "+cont);
		System.out.println("E-Mail ID     : "+mail);
		System.out.println("Proof type    : "+proof);
		System.out.println("Proof id      : "+id);
	}
}
	}

}
