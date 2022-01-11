package io.zipcoder.interfaces;




public enum Educator implements Teacher {
    LEON,
    DOLIO,
    KRIS;

    private final Instructor instructor;
    private Double numberOfHoursTaught = 0.0;

    Educator(){
        this.instructor = new Instructor((long)ordinal(), name()){
            public void teach(Learner learner, double numberOfHours){
                learner.learn(numberOfHours);
                numberOfHoursTaught += numberOfHours;
            }
        };
    }

    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
    }
}