package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class PeopleTest {

    People people = Students.getInstance();

    @Before
    public void setup(){
        people.removeAll();
    }

    @Test
    public void testAdd(){
        // given
        Person person = new Person();
        Assert.assertFalse(people.contains(person));
        // when
        people.add(person);
        // then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove(){
        // given
        Person person = new Person();
        people.add(person);
        Assert.assertTrue(people.contains(person));
        // when
        people.remove(person);
        // then
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testRemoveById(){
        // given
        Long id = Long.MIN_VALUE;
        Person person = new Person(id, "");
        people.add(person);
        Assert.assertTrue(people.contains(person));
        // when
        people.removeById(person);
        // then
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testCount(){
        int expected = 10;

        for (int i = 0; i < expected; i++){
            people.add(new Person());
        }
        int actual = people.count();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveAll(){
        // given
        int expected = 10;

        for (int i = 0; i < expected; i++){
            people.add(new Person());
        }
        int actual = people.count();
        Assert.assertEquals(expected, actual);

        // when
        people.removeAll();

        // then
        Assert.assertEquals(0, people.count());
    }

}
