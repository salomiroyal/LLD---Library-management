package org.code;

import org.code.Model.Board;
import org.code.Model.Player;
import org.code.Service.tictoctoeservice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int boardSize = 3;
        Board board = new Board(boardSize);

        // Create players
        Player playerX = new Player("Player X", 'X');
        Player playerO = new Player("Player O", 'O');
        Player currentPlayer = playerX;

        board.InitializeBoard(); // Initialize the board

        while (true) {
            board.displayBoard();
            System.out.println("Player " + currentPlayer.getSymbol() + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Make move and check validity
            if (board.makeMove(row, col, currentPlayer)) {
                if (board.checkWin(currentPlayer)) {
                    board.displayBoard();
                    System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                    break;
                }
                if (board.isfull()) {
                    board.displayBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                // Switch players
                currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        scanner.close();


    }

    }

