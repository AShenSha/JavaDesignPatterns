package memento.impl2;

import java.util.ArrayList;

/**
 * 象棋旗子备忘录管理类:负责人
 * @author ShenSha
 */
public class ChessMementoCaretaker {
    private ArrayList<ChessMemento> chessMementoList = new ArrayList();

    public ChessMemento getChessMemento(int i) {
        return chessMementoList.get(i);
    }

    public void setChessMemento(ChessMemento chessMemento) {
        chessMementoList.add(chessMemento);
    }
}
