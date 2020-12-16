package com;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter your string: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Lexer lexer = new Lexer(input);
        List<Token> output = lexer.getAllTokens();
        for(int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i).symbolText + " " + output.get(i).type);
        }

    }

}