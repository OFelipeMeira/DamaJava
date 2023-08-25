public class Checkers {
    protected int posX;
    protected int posY;

    public Checkers(int posX, int posY) {
        setPosX(posX);
        setPosY(posY);
    }

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Checkers{" +
                "posX=" + posX +
                ", posY=" + posY +
                '}';
    }

    public void move(int x, int y){
        if (Math.abs(posX - x) == Math.abs(posY - y) && (x != posX) && (y != posY)) {
            setPosY(y);
            setPosX(x);
            System.out.println("move setted");
        }else {
            System.out.println("cannot go there");
        }

    }

}
