package memento.impl2;

/**
 * @author ShenSha
 */
public class Client {
    private static int index = -1;
    private static ChessMementoCaretaker taker = new ChessMementoCaretaker();

    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 1, 1);
        play(chessman);
        chessman.setX(2);
        chessman.setY(2);
        play(chessman);
        chessman.setX(3);
        chessman.setY(3);
        play(chessman);
        undo(chessman,index);
        undo(chessman,index);
        redo(chessman,index);
    }

    public static void play(Chessman chessman) {
        taker.setChessMemento(chessman.save());
        index++;
        System.out.println("棋子" + chessman.getLabel() + "当前位置为:" + chessman.getX() + "," + chessman.getY());
    }

    public static void undo(Chessman chessman, int i) {
        System.out.println("悔棋");
        index--;
        chessman.restoreMemento(taker.getChessMemento(i - 1));
        System.out.println("棋子" + chessman.getLabel() + "当前位置为:" + chessman.getX() + "," + chessman.getY());
    }

    public static void redo(Chessman chessman, int i) {
        System.out.println("撤销悔棋");
        i++;
        chessman.restoreMemento(taker.getChessMemento(i + 1));
        System.out.println("棋子" + chessman.getLabel() + "当前位置为:" + chessman.getX() + "," + chessman.getY());

    }
}
