package io.zipcoder.interfaces;


public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
        String[] names = {"Alex", "Ajah", "Ashley", "Robyn", "Charlie"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            Student student = new Student((long)i, name);
            super.add(student);
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray(){
        return super.personList.toArray(new Student[personList.size()]);
    }
}
