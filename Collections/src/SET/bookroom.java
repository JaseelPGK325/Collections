package SET;
import java.util.*;
public class bookroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
HashSet set1=new HashSet();
int cash=0;int i=1;int room;
int n;String ac,cot,cable,wifi,laundry;
do {
	System.out.println("Menu\n1.Book\n2.Check Status\n3.Exit\nEnter your choice\n");
	n=s.nextInt();
	if(n==1) {
		System.out.println("Booking:\nPlease choose the Service required\nAC/NonAC");
	ac=s.next();
	ac=ac.toUpperCase();
		if(ac.equals("AC")) {
			cash=cash+250;
	}else {
		cash=cash+150;
	}
	System.out.println("Cot single/double");
	cot=s.next();
	cot=cot.toLowerCase();
	if(cot.equals("single"))
	{
		cash=cash+100;
	}else {
		cash=cash+200;
	}System.out.println("with cable connection or not(C/NC)");
	cable=s.next();
	cable=cable.toUpperCase();
	if(cable.equals("C")) {
		cash=cash+50;
	}else {
		cash=cash;
	}
	System.out.println("with wifi or not(W/N)");
	wifi=s.next();
	wifi=wifi.toLowerCase();
	if(wifi.equals("w")) {
		cash=cash+100;
	}else {
		cash=cash;
	}
	System.out.println("with laundry or not(L/N)");
	laundry=s.next();
	laundry=laundry.toLowerCase();
	if(laundry.equals("l")) {
		cash=cash+100;
	}else {
		cash=cash;
	}
	
	System.out.println("The total charge is Rs."+cash+"\n The services choosen are");
System.out.println(cot+" cot "+ac+" room");
System.out.println("cable connection : "+cable);
System.out.println("wifi : "+wifi);
System.out.println("laundry : "+laundry+"\n do you want to proceed?(y/n)");
	String pro=s.next();
	pro=pro.toLowerCase();
	if(pro.equals("y")) {
		
		System.out.println("Thank you for registering. your room number is "+i);
	i++;
	}
	
	}
	else if(n==2) {
		System.out.println("check status\nenter room number");
		room = s.nextInt();
		if(room==1||room==2) {
			System.out.println("The room number "+room+" is booked");
		}else {
			System.out.println("The room number "+room+" is not booked");
		}
		
	}else {
		exit();
	}



}
	
	
	while(n==1||n==2);






/*do{

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
	}else if(n==3) {
		exit();
	}
	else if(n>3||n<1) {
		System.out.println("invalid input");
	}
	
	


}*/
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}}