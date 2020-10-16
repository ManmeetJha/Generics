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
        Maximum input1=new Maximum(10,20,30);
        max= (E)input1.testMaximum();
        Assert.assertEquals(30,max);

        //Float
        Maximum input2=new Maximum(10.0,20.0,30.0);
        max= (E)input2.testMaximum();
        Assert.assertEquals(30.0,max);

        //String
        Maximum input3=new Maximum("Apple","Banana","Peach");
        max= (E)input3.testMaximum();
        Assert.assertEquals("Peach",max);

    }
}
