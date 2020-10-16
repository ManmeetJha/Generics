import org.junit.Assert;
import org.junit.Test;

import static java.lang.StrictMath.E;
import static org.junit.Assert.assertEquals;

public class MaximumTest {

    @Test
    public <E> void testMaximumTEST()
    {
        E max;

        //Integer
        Maximum input1=new Maximum();
        max= (E)input1.testMaximum(10,20,30,40,50);
        Assert.assertEquals(50,max);

        //Float
        Maximum input2=new Maximum();
        max= (E)input2.testMaximum(10.0,20.0,30.0,40.0,50.0);
        Assert.assertEquals(30.0,max);

        //String
        Maximum input3=new Maximum();
        max= (E)input3.testMaximum("Apple","Banana","Peach","Zaafran");
        Assert.assertEquals("Peach",max);

    }
}
