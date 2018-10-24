package memento.impl2;

/**
 * 象棋类
 * @author ShenSha
 */
public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存状态
     * @return
     */
    public ChessMemento save(){
        return new ChessMemento(this.label,this.x,this.y);

    }

    public void restoreMemento(ChessMemento memento){
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
