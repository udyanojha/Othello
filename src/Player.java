public class Player {
    private String name;
    private int piece;
    public Player(String name, int num) {
        setName(name);
        setPiece(num);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPiece(int piece) {
        this.piece = piece;
    }
    public int getPiece() {
        return this.piece;
    }
}
