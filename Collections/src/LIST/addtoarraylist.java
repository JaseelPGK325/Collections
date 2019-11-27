package LIST;
import java.util.*;
public class addtoarraylist{

  public static void main(String args[])
  {Scanner s=new Scanner(System.in);
  System.out.println("enter size");
   int n=s.nextInt();
   ArrayList list=new ArrayList();//declare arraylist
   for(int i=0;i<n;i++){
   String m=s.next();
     list.add(m);//add Strings to arraylist
     
   }
   Iterator itr=list.iterator();
   while(itr.hasNext()){        //boolean 
   System.out.println(itr.next());
   }
    //type your code here
  }
}