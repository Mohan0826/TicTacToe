package com.bridglabTicTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

        String player1, player2;

        public static void main(String[] args) {
            int n = 10;
            char[][] board = new char[10][];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    board[i][j] = '-';
                }
            }
            Scanner in = new Scanner(System.in);
            System.out.println("TicTacToe ready for play");
            System.out.println("what is the player1 name : ");
            int player1 = in.nextInt();
            System.out.println("what is the player2 name : ");
            int player2 = in.nextInt();

            boolean player = true;
            boolean GameEnded = false;

            if(player){
                System.out.println(player1 + " trun (x):");
                System.out.println(player2 +"trun (0):");
            }

        }

    }