package guru.springframework.recipeproject.models;

import java.util.ArrayList;

public class Details {
    public static ArrayList<Details> Data = new ArrayList<Details>();
    public int number;
    public String name;

    public static ArrayList<Details> getData() {
        return Data;
    }

    public Details(int number, String name) {

        this.number = number;
        this.name = name;
    }
}
