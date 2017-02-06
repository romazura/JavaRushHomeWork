package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer [] arr = new Integer[3];
        for (int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int count = 0;
        for(int list : arr){
            if(list>0){
                count++;
            }
        }

        System.out.println(count);
    }
}
