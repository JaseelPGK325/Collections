package SET;
import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet name=new HashSet();
name.add("musu");
name.add("jasi");
name.add("mubu");
name.add("farzi");
name.add("ifu");
name.add("shilu");
name.add("munee");
name.add("musu");
name.add("munee");
name.add("ifu");

Iterator itr=name.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
