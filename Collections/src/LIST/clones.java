package LIST;
import java.util.*;
public class clones {
	  public static void main(String args[])
	  {Scanner s=new Scanner(System.in);
	  System.out.println("enter size");
	   int n=s.nextInt();
	   System.out.println("enter Strings");
	   ArrayList list=new ArrayList();
	   for(int i=0;i<n;i++){
	String name=s.next();
	     list.add(name);
	   }
	   ArrayList list1=(ArrayList)list.clone();
	   System.out.println("Actual LinkedList:");
	   Iterator itr=list.iterator();
	   while(itr.hasNext()){
	   System.out.println(itr.next());}
	      System.out.println("Cloned LinkedList:");
	   Iterator itr1=list1.iterator();
	   while(itr1.hasNext()){
	   System.out.println(itr1.next());}
	   
	    //type your code here
	  }
	}
