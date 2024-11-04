package org.code.DAL;

import org.code.Model.Board;

public class tictoctoeDAO implements tictoctoeIF {

    private Board board;

    public tictoctoeDAO(int size) {
        board = new Board(size);
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public void saveBoard(Board board) {

    }

    @Override
    public void updateBoard(Board board) {
        this.board = board;
    }
}
