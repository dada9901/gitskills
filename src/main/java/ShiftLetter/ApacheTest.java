package ShiftLetter;
import org.apache.commons.collections4.CollectionUtils;
import java.util.*;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
public class ApacheTest {
	public static Collection<Integer> getUnion(Set<Integer> set1,Set<Integer> set2)
	{
		Collection<Integer> col = CollectionUtils.union(set1, set2);
        for(Integer temp:col)
        {
            System.out.print(temp+" ");
        }
        System.out.println();
		return col;
	}
	
	public static Collection<Integer> getIntersection(Set<Integer> set1,Set<Integer> set2)
	{
		Collection<Integer> col = CollectionUtils.retainAll(set1, set2);
        for(Integer temp:col)
        {
            System.out.print(temp+" ");
        }		
        System.out.println();
		return col;
	}
	public static Collection<Integer> getSubtract(Set<Integer> set1,Set<Integer> set2)
	{
		Collection<Integer> col = CollectionUtils.subtract(set1, set2);
        for(Integer temp:col)
        {
            System.out.print(temp+" ");
        }		
        System.out.println();
		return col;
	}
    public static void wordcount(String[] s){
        Bag<String> bag = new TreeBag<>();
        for(String temp:s)
        {
            bag.add(temp);
        }

        System.out.println("=====统计次数========");
        Set<String> keys = bag.uniqueSet();
        for(String letter:keys)
        {
            System.out.println(letter+"-->"+bag.getCount(letter));
        }
    }   

	public static void main(String argv[])
	{
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        ApacheTest.getUnion(set1,set2);
        ApacheTest.getIntersection(set1, set1);
        ApacheTest.getSubtract(set1, set2);
        FileGet f=new FileGet("test2.txt");
        String s;
        s=f.toString().replaceAll("\\p{P}"," ");
        String[]  strArray  = s.split(" ");
        ApacheTest.wordcount(strArray);
		return;
	}
}
