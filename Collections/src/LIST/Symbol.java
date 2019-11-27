package LIST;

import java.util.Comparator;

public class Symbol implements Comparator<NewCard>{
public int compare(NewCard c1,NewCard c2) {
	return c1.getName().compareTo(c2.getName());
}
}
