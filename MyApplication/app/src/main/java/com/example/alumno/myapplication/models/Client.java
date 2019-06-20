package com.example.alumno.myapplication.models;

public class Client {
    private String Username;
    private String First_name;
    private String Last_name;
    private int Year_old;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public int getYear_old() {
        return Year_old;
    }

    public void setYear_old(int year_old) {
        Year_old = year_old;
    }
}
