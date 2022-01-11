package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureByTeacher(){
        // given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructor instructor = new Instructor();
        int hoursPerStudent = 10;
        int totalHours = students.count() * hoursPerStudent;
        Map<Student, Double> preStudyMap = zcw.getStudyMap();

        // when
        zcw.hostLecture(instructor, totalHours);
        Map<Student, Double> postStudyMap = zcw.getStudyMap();

        for(Map.Entry<Student, Double> entry : postStudyMap.entrySet()){
            Student currentStudent = entry.getKey();
            Double previousStudyTime = preStudyMap.get(currentStudent);
            Double postStudyTime = postStudyMap.get(currentStudent);

            Double expected = previousStudyTime + hoursPerStudent;

            // then
            Assert.assertEquals(expected, postStudyTime);
        }
    }

    @Test
    public void testHostLectureByTeacherId(){
        // given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructor instructor = (Instructor) Instructors.getInstance().getById(Long.MIN_VALUE);
        int hoursPerStudent = 10;
        int totalHours = students.count() * hoursPerStudent;

        // when
        zcw.hostLecture(instructor.getId(), totalHours);
        Student[] studentArray = students.toArray();
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            double totalStudyTime = student.getTotalStudyTime();

            // then
            Assert.assertEquals(hoursPerStudent, totalStudyTime, 0);
        }
    }
}


