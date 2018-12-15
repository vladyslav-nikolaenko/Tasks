package GameStrategy;

import Board.Board;

import java.util.List;

public interface GameStrategy {

    void setBoard(Board board);
    void play();
    List getWinCoordinatesBySymbol();

}
