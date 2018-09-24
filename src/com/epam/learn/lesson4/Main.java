package com.epam.learn.lesson4;


import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {

        String word = "qwerty";
        System.out.println(word);

        System.out.println(word.charAt(2));

        System.out.println(word.toCharArray()[word.length() - 1]);

        Main main = new Main();
        try(java.io.BufferedReader reader = new java.io.BufferedReader(new InputStreamReader(System.in))) {
            String param = reader.readLine();
            int k =Integer.parseInt(param);
            System.out.println(word.charAt(k));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        String word2 = null;

        //word[4] = word[1];




    }
}
