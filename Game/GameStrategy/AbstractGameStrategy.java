package GameStrategy;

import Board.Board;

public abstract class AbstractGameStrategy implements GameStrategy{


    protected Board board;


    abstract void initializeWinCoordinates();

    public AbstractGameStrategy(){
        initializeWinCoordinates();
    }

}
