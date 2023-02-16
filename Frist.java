import java.util.*;
public class Frist
{
public static void main(String args[])
{
ArrayList<Integer>al=new ArrayList<>();
al.add(5);
al.add(3);
al.add(4);
al.add(5);
al.add(1);
al.add(3);
int first=al.get(0);
int last=al.get(al.size()-1);
System.out.println("Frist element in an arraylist:"+first);
System.out.println("last element in an arrylist:"+last);
}
}
