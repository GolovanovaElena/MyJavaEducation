package com.mycompany.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author:" + "\n" + "name: " + this.name + "\n"
                + "e-mail: " + this.email + "\n"
                + "gender: " + this.gender;
    }
}
