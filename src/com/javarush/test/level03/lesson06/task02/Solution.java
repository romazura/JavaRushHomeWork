package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public Solution(int number){
        int a=0;
        for (int i=1; i<=10;i++){
            a+=number;
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Solution a = new Solution(1);
        Solution b = new Solution(2);
        Solution c = new Solution(3);
        Solution d = new Solution(4);
        Solution e = new Solution(5);
        Solution f = new Solution(6);
        Solution g = new Solution(7);
        Solution k = new Solution(8);
        Solution l = new Solution(9);
        Solution m = new Solution(10);
    }
}
