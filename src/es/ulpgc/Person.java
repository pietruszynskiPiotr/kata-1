package es.ulpgc;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final String name;

    private final LocalDate birthday;

    public Person(String name, LocalDate birthDay) {
        this.name = name;
        this.birthday = birthDay;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
}
