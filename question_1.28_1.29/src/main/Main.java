package main;

import java.util.Scanner;

import process.Display;
import process.Sorting;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("昇順で並べる場合は0を、降順で並べる場合は1を入力してください：");

        int order = scanner.nextInt();

        System.out.print("都道府県の番号を選択して入力してください：");

        scanner.nextLine();
        String input = scanner.nextLine();

        String[] numArray = input.split(",");

        String[] sortedPrefectures = Sorting.sortPrefectures(numArray, order);

        Display.displayPrefectures(sortedPrefectures);

        scanner.close();
    }
}