package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        // given
        long expectedId = 1;
        String expectedName = "Alex";
        // when
        Person person = new Person(expectedId, expectedName);
        // then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }

    @Test
    public void setNameTest(){
        // given
        Person person = new Person();
        String expectedName = "John";
        // when
        person.setName(expectedName);
        // then
        Assert.assertEquals(expectedName, person.getName());
    }

}
