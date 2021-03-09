package ru.matyunin.inno.task1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Принимаем из консоли размер массива
        System.out.println("Введите количество проверяемых чисел");
        int arraySize;
        try {
            arraySize = scanner.nextInt();
            if (arraySize < 1) {
                throw new InputMismatchException("Должно быть введено число не меньше 1");
            }
            scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        }

        //принимаем диапазон проверяемых чисел
        System.out.println("Введите верхнюю границу диапазоа проверяемого числа (нижняя граница 0)");
        int arrayElementSize;
        try {
            arrayElementSize = scanner.nextInt();
            if (arrayElementSize < 3) {
                throw new InputMismatchException("Должно быть введено число не меньше 3");
            }
            scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new InputMismatchException(e.getMessage());
        }

        //создадим и заполним случайными числами с помощью Random
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(arrayElementSize);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int check = (int) Math.sqrt(array[i]);
            if (check * check == array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
