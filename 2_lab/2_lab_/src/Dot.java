public class Dot {
    private int x;
    private int y;

    public Dot(int x, int y) {
        setCoordinate(x, y);
    }

    public Dot() {
        this.x = 0;
        this.y = 0;
    }

    public Dot(Dot dot) {
        this.x = dot.x;
        this.y = dot.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }


}
