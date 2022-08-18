package ru.geekbrains.java_core.lesson4.HomeWork;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1.");
        System.out.println("Зададим массив слов:");
        System.out.println(Arrays.toString(createArrayWords()));
        System.out.println();
        System.out.println("Выведем неповторяющиеся слова на экран:");
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание №2.");
        System.out.println("Создадим телефонный справочник и осуществим поиск номеров по именам абонентов:");
        doPhoneBook();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Виктор","89670049109");
        phoneBook.addElementPhoneBook("Виктор","89670049110");
        phoneBook.addElementPhoneBook("Виктор","89670049111");

        phoneBook.addElementPhoneBook("Александр","888888");
        phoneBook.addElementPhoneBook("Александр","888888");
        phoneBook.addElementPhoneBook("Александр","888888   ");
        phoneBook.addElementPhoneBook("Александр","888  88 8 ");
        phoneBook.addElementPhoneBook("Александр","8  8  8 888     ");

        phoneBook.addElementPhoneBook("Федор","89712977213");

        phoneBook.addElementPhoneBook("Никита","89882548789");

        System.out.println("Виктор: " + phoneBook.getPhonesByName("Виктор"));
        System.out.println("Александр: " + phoneBook.getPhonesByName("Александр"));
        System.out.println("Федор: " + phoneBook.getPhonesByName("Федор"));
        System.out.println("Никита: " + phoneBook.getPhonesByName("Никита"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Машина";
        strings[1] = "Мотоцикл";
        strings[2] = "Животное";
        strings[3] = "Солнце";
        strings[4] = "Машина";
        strings[5] = "Мотоцикл";
        strings[6] = "Яхта";
        strings[7] = "Самолет";
        strings[8] = "Человек";
        strings[9] = "Самолет";
        return strings;
    }

}
