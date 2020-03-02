import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTest1Test {

    @Test
    public void testing(){
        JunitTest1 testing = new JunitTest1();
        int result = testing.numberAdd(3,2);
        assertEquals(5,result);
    }
    public void stringTest(){
        JunitTest1 testing2 = new JunitTest1();
        String result2 = testing2.Example("Michael","Momo");
        assertEquals("MichaelMomo",result2);
        }
    }