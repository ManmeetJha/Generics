import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumTest {

    @Test
    public void maximumValueIntegerTC() {
        int max;

        //Input for TC1.1
        Integer[] input1 = {6, 2, 3};
        max = Maximum.getMaximumInteger(input1);
        Assert.assertEquals(6, max);

        //Input for TC1.2
        Integer[] input2 = {2, 6, 3};
        max = Maximum.getMaximumInteger(input2);
        Assert.assertEquals(6, max);

        //Input for TC1.3
        Integer[] input3 = {1, 4, 6};
        max = Maximum.getMaximumInteger(input3);
        Assert.assertEquals(6, max);
    }


}
