package ticTacToeTest;

import ticTacToe.TicTacToe;

import java.util.Scanner;

public class TicTacToeTest{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        TicTacToe T = new TicTacToe();

        int i = 0, j =0;

        while(!T.gameState()){

            T.printBoard();

            System.out.println();

            System.out.println("Player 1's Turn:");

            i = sc.nextInt();

            j = sc.nextInt();

            T.player1sTurn(i, j);

            T.printBoard();

            if(T.gameState())
                break;

            System.out.println("Player 2's Turn:");

            i = sc.nextInt();

            j = sc.nextInt();

            T.player2sTurn(i, j);
        }
    }
}



