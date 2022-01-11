package io.zipcoder.interfaces;


public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name){
    }

    public Instructor(){
        super(Long.MIN_VALUE, "");
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double NumberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++){

        }
    }
}
