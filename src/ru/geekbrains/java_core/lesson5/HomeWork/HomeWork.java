package ru.geekbrains.java_core.lesson5.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        AppData data = new AppData();

        data.readFromFile("example.csv");

        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }

}
