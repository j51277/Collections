// Avarge numder of element 
import java.util.*;
public class Numerset
{
public static void main(String args[])
{
TreeSet<Integer>ts=new TreeSet<Integer>();
{
ts.add(5);
ts.add(7);
ts.add(8);
ts.add(1);
ts.add(4);
ts.add(9);
ts.add(0);
ts.add(7);
System.out.println("Elements in set:"+ts);
int sum=0;
ArrayList<Integer>al1=new ArrayList<Integer>();
al1.addAll(ts);
for(int i=0;i<ts.size();i++)
{
sum=sum+al1.get(i);
}
int average=sum/al1.size();
System.out.println("sum of the elements in set:" +sum);
System.out.println("Average of the elements in set:"+average);
}
}
}

//AverageofNumerset a=new AverageofNumerset();
//a.Average();

//} 
