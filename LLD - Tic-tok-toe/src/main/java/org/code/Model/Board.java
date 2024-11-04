package org.code.Model;

public class Board {
    private int size;
    private char[][] grid;

    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        InitializeBoard();
    }

    public int getSize() {
        return size;
    }

    public char[][] getGrid() {
        return grid;
    }

    public void InitializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMark(int row, int col, char symbol) {
        if (grid[row][col] == '-') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean makeMove(int row, int col, Player player) {
        if (isValidMove(row, col)) {
            grid[row][col] = player.getSymbol();
            return true;
        }
        return false;
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '-';
    }

    public boolean checkWin(Player player) {
        char symbol = player.getSymbol();

        // Check rows 
        for (int i = 0; i < size; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < size; i++) {
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }

        // Check diagonal (top-left to bottom-right)
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }

        // Check diagonal (top-right to bottom-left)
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public boolean isfull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(grid[i][j] == '-'){
                    System.out.print("board is not fulfill");
                    return false;
            }
        }
    }
        System.out.print("board is fulfill");
        return true;
  }

}




