import java.util.*;
public class DisLinked
{
public static void main(String args[])
{
List<Integer> l=new LinkedList<Integer>();
l.add(6);
l.add(7);
l.add(8);
l.add(9);
l.add(10);
System.out.println(l);
Collections.sort(l);
System.out.println("after decending sort");
Collections.reverse(l);
System.out.println(l);
}
}
