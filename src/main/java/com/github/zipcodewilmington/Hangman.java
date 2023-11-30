package com.github.zipcodewilmington;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
        public static void main(String[] args) {
            final InputStream inputSource = System.in;
            final Scanner scanner = new Scanner(inputSource); // allows us to get input
            System.out.println("Enter a word to be guessed:");
            final String secretWord = scanner.nextLine();
            String guessedWord = null;
            while(!secretWord.equals(guessedWord)) {
                System.out.println("Enter your guess!");
                guessedWord = scanner.nextLine();
            }
            System.out.println("You entered the correct value!");
        }
    }
