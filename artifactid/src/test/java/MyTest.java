import junit.framework.Assert;

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class MyTest {
    @Test
    public void test1(){
        Assert.assertTrue(true);
    }

    @Test
    public void test2(){
    System.out.println("hi");
    boolean condition=true;
    if(!condition){}
        Assert.assertTrue(true);
    }


}

