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

    @Test
    public void maximumValueFloatTC() {
        float max;

        //Input for TC2.1
        Float[] input1 = {6.0f, 2.0f, 3.0f};
        max =Maximum.getMaximumFloat(input1);
        Assert.assertEquals(6.0f, max,0.0f);

        //Input for TC2.2
        Float[] input2 = {2.0f, 6.0f, 3.0f};
        max =Maximum.getMaximumFloat(input2);
        Assert.assertEquals(6.0f, max, 0.0f);

        //Input for TC2.3
        Float[] input3 = {1.0f, 4.0f, 6.0f};
        max =Maximum.getMaximumFloat(input3);
        Assert.assertEquals(6.0f, max,0.0f);
    }


}
