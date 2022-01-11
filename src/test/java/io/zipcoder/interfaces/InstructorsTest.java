package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InstructorsTest {

    @Test
    public void test(){
        List<String> nameList = Arrays.asList("Wilhem", "Froilan", "Kris", "Dolio", "Nhu");
        Instructors instructors = Instructors.getInstance();
        Person[] array = instructors.toArray();

        Assert.assertTrue(array.length > 0);
        for (int i = 0; i < array.length; i++){
            Person person = array[i];
//            Assert.assertTrue(nameList.contains(person.getName()));
        }
    }
}
