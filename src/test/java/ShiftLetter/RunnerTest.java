package ShiftLetter;

import org.junit.Test;
import static org.junit.Assert.*;

public class RunnerTest {

    @Test
    public void unitTest1() {
        String tmp="asdfghjjjAAAA";
        ShiftProgram sp=new ShiftProgram("filename");
        sp.toLowerCase(tmp);
        String result=sp.toString();
        assertEquals("asdfghjjjaaaa",result);
    }

    @Test
    public void unitTest2() {
        String tmp="asdfghjjjAAAA";
        ShiftProgram sp=new ShiftProgram("filename");
        sp.toUpperCase(tmp);
        String result=sp.toString();
        assertEquals("ASDFGHJJJAAAA",result);
    }

    @Test
    public void unitTest3() {
        String[] tmp=new String[2];
        tmp[0]="test.txt";
        tmp[1]="low";
        String expect="asdfghjjjaaaa";
        ShiftProgram sp=new ShiftProgram("test.txt");
        sp.run(false);
        assertEquals(expect,sp.toString());
    }

    @Test
    public void testDrive1() {
        FileGet fg=new FileGet("test.txt");
        assertEquals("asdfghjjjAAAA",fg.toString());
    }

    @Test
    public void testDrive2() {
        FileGet fg=new FileGet("test.txt");
        ShiftProgram sp=new ShiftProgram("filename");
        sp.toUpperCase(fg.toString());
        String result=sp.toString();
        assertEquals("ASDFGHJJJAAAA",result);
    }

    @Test
    public void testDrive3() {
        FileGet fg=new FileGet("test.txt");
        ShiftProgram sp=new ShiftProgram("filename");
        sp.toUpperCase(fg.toString());
        FileWrite fw=new FileWrite("result"+"test.txt",sp.toString());
        FileGet fg2=new FileGet("resulttest.txt");
        assertEquals("ASDFGHJJJAAAA",fg2.toString());
    }

    @Test
    public void test1(){
        String[] tmp=new String[2];
        tmp[0]="test.txt";
        tmp[1]="low";
        String expect="asdfghjjjaaaa";
        Runner.main(tmp);
        assertEquals(expect,Runner.result);
    }

    @Test
    public void test2(){
        String[] tmp=new String[2];
        tmp[0]="test.txt";
        tmp[1]="up";
        String expect="ASDFGHJJJAAAA";
        Runner.main(tmp);
        assertEquals(expect,Runner.result);

    }

    @Test
    public void test3(){
        String[] tmp=new String[0];
        Runner.main(tmp);
        assertEquals(false,Runner.status);

    }

    @Test
    public void test4(){
        String[] tmp=new String[2];
        tmp[0]="test.txt";
        tmp[1]="what";
        Runner.main(tmp);
        assertEquals(false,Runner.status);
    }
}