package org.code.Service;


import org.code.DAL.tictoctoeDAO;
import org.code.Model.Board;
import org.code.Model.Player;

public class tictoctoeservice {

    private tictoctoeDAO dao;

    public tictoctoeservice(int size) {
        dao = new tictoctoeDAO(size);
        initializeBoard();
    }

    public void initializeBoard() {
        dao.getBoard().InitializeBoard();
    }

    public void displayBoard() {
        dao.getBoard().displayBoard();
    }


    public boolean placeMark(int row, int col, Player player) {
        return dao.getBoard().placeMark(row, col, player.getSymbol());
    }

    public boolean makeMove(int row, int col, Player player) {
        if (dao.getBoard().isValidMove(row, col)) {
            dao.getBoard().makeMove(row, col, player);
            return true;
        }
        return false;
    }

    public boolean checkWin(Player player) {
        return dao.getBoard().checkWin(player);
    }

    public boolean isFull() {
        return dao.getBoard().isfull();
    }


    public void saveGame() {
        dao.saveBoard(dao.getBoard());
    }
}
