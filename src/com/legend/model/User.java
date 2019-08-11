package com.legend.model;

public class User {

    private String username;
    private int age;
    private String passwd;

    public User() {
    }

    public User(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
