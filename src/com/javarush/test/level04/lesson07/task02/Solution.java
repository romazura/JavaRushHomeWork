package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        reader.close();

        String even = "четное ";
        String odd = "нечетное ";
        String one = "однозначное число";
        String two = "двузначное число";
        String three = "трехзначное число";

        if (a>0 && a<10){
            if (a%2 == 0){
                System.out.print(even);
            }else{
                System.out.print(odd);
            }
            System.out.print(one);

        }else if (a>=10 && a<100){
            if (a%2 == 0){
                System.out.print(even);
            }else{
                System.out.print(odd);
            }
            System.out.print(two);

        }else if (a>=100 && a<1000) {
            if (a % 2 == 0) {
                System.out.print(even);
            } else {
                System.out.print(odd);
            }
            System.out.print(three);
        }
    }
}
