package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void test(){
        Educator educator = Educator.FROILAN;
        Assert.assertEquals(0, educator.getNumberOfHoursTaught(), 0);

        Learner l = new Student();
        educator.teach(l, 10);

        Assert.assertEquals(10, educator.getNumberOfHoursTaught(), 0);
    }
}
