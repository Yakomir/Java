package ru.geekbrains.java;

import java.util.Scanner;
import java.util.Random;

public class Guess_The_Number
{
    public static void main(String[] args)
    {
        playGameGuessWord();
    }

    static void playGameGuessWord()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secret = random.nextInt(words.length);
        String word = words[secret];
        int word_length = word.length();
        System.out.println("I make up name fruit or vegetable. Try to guess it.");
        System.out.println(secret);
        System.out.println(word_length);
        System.out.println(word);
        System.out.println("Type fruit or vegetable name: ");
        String answer = scanner.nextLine();

        for (int i = 0; i < 15; i++)
        {
            char a = word.charAt(i);
            char b = answer.charAt(i);
            if (a == b)
            {
                System.out.print(a);
            }
            if (a != b)
            {
                System.out.print("*");
            }
        }


    }
}
