package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long instructorId, double numberOfHours){
        Teacher teacher = (Teacher) instructors.getById(instructorId);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for (Student student : students){
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
