package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String substr = scanner.nextLine();
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        System.out.println(count);
        System.out.print("Введите строку: ");
        String str2 = scanner.nextLine();
        String replacedStr = str2.replaceAll("\\кака|бяка", "вырезано цензурой");
        System.out.println(replacedStr);
        System.out.print("Введите строку с датой в формате dd.MM.yyyy: ");
        String strDate = scanner.nextLine();
        String[] dateParts = strDate.split("\\.");
        String newStrDate = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0];
        System.out.println(newStrDate);
    }
}