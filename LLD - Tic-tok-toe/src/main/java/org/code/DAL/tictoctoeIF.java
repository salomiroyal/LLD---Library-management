package org.code.DAL;

import org.code.Model.Board;

public interface tictoctoeIF {
    Board getBoard();
    void saveBoard(Board board);
    void updateBoard(Board board);
}
