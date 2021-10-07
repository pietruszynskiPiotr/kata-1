package es.ulpgc;

import java.util.Date;

public class Person {

    private final String name;

    private final Date birthday;

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthday = birthDay;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - birthday.getTime())/31536000000L);
    }
}