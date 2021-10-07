package es.ulpgc;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Blas", LocalDate.of(1993, 8, 2));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
