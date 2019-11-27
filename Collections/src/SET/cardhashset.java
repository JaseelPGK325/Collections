package SET;
import java.util.*;

import LIST.NewCard;
import LIST.Symbol;
public class cardhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of cards");
		int n=s.nextInt();
Set <NewCard>card=new TreeSet<NewCard>(new Symbol());
NewCard[]c=new NewCard[40];
int count=0;

while(card.size()<n) {
	String name=s.next();
	int num=s.nextInt();
	
	c[count]=new NewCard();
	c[count].setName(name);
	c[count].setNum(num);
	card.add(c[count]);
	count++;
}System.out.println(n+" symbol gatherd in "+count+" cards");
System.out.println("cards are ");
Iterator<NewCard> itr=card.iterator();
while(itr.hasNext()) {
	NewCard ca=itr.next();
	System.out.println(ca.getName()+" "+ca.getNum());
}
}

	}

