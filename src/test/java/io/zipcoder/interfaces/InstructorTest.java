package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        // given
        Instructor instructor = new Instructor();
        Student learner = new Student();
        double preStudyTime = learner.getTotalStudyTime();
        double numberOfHoursToBeTaught = 50;
        double expected = preStudyTime + numberOfHoursToBeTaught;
        // when
        instructor.teach(learner, numberOfHoursToBeTaught);
        // then
        Assert.assertEquals(expected, numberOfHoursToBeTaught, 0);
    }

    @Test
    public void testLecture(){
        // given
        Instructor instructor = new Instructor();
        Student learner1 = new Student();
        Student learner2 = new Student();
        Student[] learners = new Student[]{learner1, learner2};

        double numberOfHoursToBeTaught = 20;
        double numberOfHoursToBeTaughtPerStudent = numberOfHoursToBeTaught / learners.length;

        double preStudyTime1 = learner1.getTotalStudyTime();
        double preStudyTime2 = learner2.getTotalStudyTime();

        double postStudyTime1 = preStudyTime1 + numberOfHoursToBeTaughtPerStudent;
        double postStudyTime2 = preStudyTime2 + numberOfHoursToBeTaughtPerStudent;

        double actual1 = postStudyTime1;
        double actual2 = postStudyTime2;

        // when
        instructor.lecture(learners, numberOfHoursToBeTaught);

        // then
        Assert.assertEquals(numberOfHoursToBeTaughtPerStudent, actual1, 0);
        Assert.assertEquals(numberOfHoursToBeTaughtPerStudent, actual2, 0);
    }

}
