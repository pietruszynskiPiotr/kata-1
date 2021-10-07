package es.ulpgc;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1993, 8, 2);
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }

}
