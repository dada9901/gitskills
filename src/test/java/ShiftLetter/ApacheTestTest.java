package ShiftLetter;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.TreeBag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApacheTestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUnion() {
		Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        Collection<Integer> col= ApacheTest.getUnion(set1,set2);
        assertEquals(4,col.size());
	}

	@Test
	public void testGetIntersection() {
		Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        Collection<Integer> col= ApacheTest.getIntersection(set1, set1);
        assertEquals(3,col.size());
	}
	@Test
	public void testMain() {
		ApacheTest test1 = new ApacheTest();
		test1.main("".split(" "));
	}
	@Test
	public void testGetSubtract() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        Collection<Integer> col= ApacheTest.getSubtract(set1, set2);
        assertEquals(1,col.size());
	}
	/*
	@Test
	public void testCheck() {
		String test1="dadada";
		FileGet fget=new FileGet("test.txt");
		assertEquals(false,fget.check(test1));
		String test2 ="dasdsadw..";
		assertEquals(true,fget.check(test2));
	}*/
	@Test
	public void testWordcount() {
        String[]  strArray  = "hello david".split(" ");
        ApacheTest.wordcount(strArray);
	}

}
