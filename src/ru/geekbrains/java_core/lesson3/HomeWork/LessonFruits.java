package ru.geekbrains.java_core.lesson3.HomeWork;

import java.util.Arrays;

public class LessonFruits {

    public static void main(String[] args) {
        System.out.println("""
                Задание №1.
                Создадим строковый массив, содержащий некие имена:""");

        String[] array = {"Александр", "Мария", "Борис", "Владимир", "Артём"};
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Поменяем местами 3й и 5й элементы массива, используя промежуточный объект для" + '\n' +
                "сохранения промежуточного значения элемента массива:");
        doLesson_Array(array, 2, 4);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Создадим массив, содержащий целочисленные значения:");
        Integer[] integers = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(integers));
        System.out.println();
        System.out.println("Поменяем местами числа 4 и 3 не используя сохранение промежуточных значений:");
        doLesson_ArrayWithoutTemp(integers, 1, 2);

        System.out.println("""
                ----------------------------------------------------------------------------------------
                
                Задание №2.""");

        doLesson_Fruits();
    }

    private static void doLesson_Fruits() {
        System.out.println("Создадим коробки для фруктов (1я и 3я для яблок, 2я для апельсинов) и наполним " +
                "коробки фруктами.");
        BoxFruit<Apple> appleBox1 = new BoxFruit<Apple>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);

        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox1.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Сравним по весу 1ю коробку с яблоками и коробку с апельсинами:");
        System.out.println("Вес коробки с яблками: " + appleBox1.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Вес коробок одинаковый? - " + appleBox1.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox1.addFruits(appleBox2);

    }

    private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}
