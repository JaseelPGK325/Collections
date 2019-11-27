package LIST;
import java.util.*;
class addallarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add("aaa");
list.add("bbb");
list.add("ccc");
ArrayList list1=new ArrayList();
list1.add("ddd");
list1.add("eee");
System.out.println("original list:["+list+"]");
list.addAll(list1);
System.out.println("copy list:["+list+"]");
	}

}
