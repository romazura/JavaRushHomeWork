package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[4];

        for (int i=0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
        }

        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[maxIndex] < numbers[i]) {
                maxIndex = i;
            }
        }
        System.out.println(numbers[maxIndex]);
    }
}
