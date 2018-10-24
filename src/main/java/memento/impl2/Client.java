package memento.impl2;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        ChessMementoCaretaker taker = new ChessMementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        display(chessman);
        taker.setChessMemento(chessman.save());
        chessman.setX(4);
        display(chessman);
        taker.setChessMemento(chessman.save());
        chessman.setX(5);
        display(chessman);
        System.out.printf("悔棋");
        chessman.restoreMemento(taker.getChessMemento());
        display(chessman);
    }
    public static  void display(Chessman chessman){
        System.out.println("棋子"+chessman.getLabel()+"当前位置为:"+chessman.getX()+","+chessman.getY());
    }
}
