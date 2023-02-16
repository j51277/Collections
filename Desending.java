import java.util.*;
public class Desending
{
public static void main (String args[])
{
List al=new ArrayList();
al.add(22);
al.add(7);
al.add(5);
al.add(9);
al.add(1);
System.out.println("orinal order of Arraylist"+al);
//System.out.println(al);
Collections.sort(al);
System.out.println("After ascending sorting"+al);
//System.out.println(al);
Collections.reverse(al);
System.out.println("After descending sorting"+al);
/* for(int i=0;i<al.size();i++)
{
System.out.print(al.get(i));
}
*/
}
}
