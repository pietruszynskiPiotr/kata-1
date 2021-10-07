package es.ulpgc;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(93, 8, 2));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
