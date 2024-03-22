package dev.fedichkin;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {

        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is null");
        }

        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("surname is null");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("age < 0 OR age > 120");
        }

        Person person = new Person(name, surname, age);
        person.setAddress(address);

        return person;
    }

}
