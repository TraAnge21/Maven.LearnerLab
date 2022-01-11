package io.zipcoder.interfaces;


public class Student extends Person implements Learner {
    private Double totalStudyTime = 0.0;

    public Student(long id, String name){
        super(id, name);
    }

    public Student(){
        super(Long.MIN_VALUE, "");
    }

    public void learn(double numberOfHours) {
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}