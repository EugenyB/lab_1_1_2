package main;

import java.io.Serializable;

public class User implements Serializable {

    public final static int serialVersionUID = 1;

    private int id;
    private String name;
    private String lastName;
    private double weight;

    public User(int id, String name, String lastName, double weight) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight;
    }
}
