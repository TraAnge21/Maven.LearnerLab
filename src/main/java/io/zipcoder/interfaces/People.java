package io.zipcoder.interfaces;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class People<E extends Person> implements Iterable<E> {
    protected List<E> personList = new ArrayList<E>();

    public void add(Person p){
        personList.add((E) p);
    }

    public void remove(Person p ){
        personList.remove(p);
    }

    public void removeById(Person p){
        personList.remove(p);
    }

    public int count(){
        return personList.size();
    }

    public Person getById(Long id){
        for (Person p : personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public Boolean contains(Person p){
        return personList.contains(p);
    }

    public void removeAll(){
        personList.clear();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }

}
