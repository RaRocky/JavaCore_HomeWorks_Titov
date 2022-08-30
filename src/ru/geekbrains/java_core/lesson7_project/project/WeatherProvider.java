package ru.geekbrains.java_core.lesson7_project.project;

import ru.geekbrains.java_core.lesson7_project.project.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
