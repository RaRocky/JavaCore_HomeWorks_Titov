package ru.geekbrains.java_core.lesson8.HomeWork.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Minimum {
    @Override
    public String toString() {
        return "Minimum{" +
                "Unit='" + unit + '\'' +
                ", UnitType=" + unitType +
                ", Value=" + value +
                '}';
    }

    @JsonProperty(value = "Unit")
    private String unit;

    @JsonProperty(value = "UnitType")
    private float unitType;

    @JsonProperty(value = "Value")
    private float value;
}
