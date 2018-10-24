package memento.impl2;

/**
 * 象棋旗子备忘录管理类:负责人
 * @author ShenSha
 */
public class ChessMementoCaretaker {
    private ChessMemento chessMemento;

    public ChessMemento getChessMemento() {
        return chessMemento;
    }

    public void setChessMemento(ChessMemento chessMemento) {
        this.chessMemento = chessMemento;
    }
}
