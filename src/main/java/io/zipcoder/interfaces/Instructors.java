package io.zipcoder.interfaces;



public class Instructors extends People <Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        String[] names = {"Wilhem", "Froilan", "Kris", "Dolio", "Nhu"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            Instructor instructor = new Instructor((long)i, name);
            super.add(instructor);
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray(){
        return super.personList.toArray(new Instructor[personList.size()]);
    }
}
