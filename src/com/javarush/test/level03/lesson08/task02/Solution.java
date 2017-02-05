package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();

        int iNumber1 = Integer.parseInt(sNumber1);
        int iNumber2 = Integer.parseInt(sNumber2);

        System.out.println(name+" получает "+iNumber1+" через "+iNumber2+" лет.");
    }
}