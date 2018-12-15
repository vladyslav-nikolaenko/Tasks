package GameStrategy;

import Board.Board;

import java.util.List;

public class MockGameStrategy extends AbstractGameStrategy {

    @Override
    void initializeWinCoordinates() {

    }

    @Override
    public void setBoard(Board board) {

    }

    @Override
    public void play() {

        board.draw();
    }

    @Override
    public List getWinCoordinatesBySymbol() {
        return null;
    }

}
