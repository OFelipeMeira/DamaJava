public class Checkers {
    private int posX;
    private int posY;
    private boolean active = false;
    boolean isWhite;

    public Checkers(int posX, int posY,boolean isWhite) {
        setPosX(posX);
        setPosY(posY);
        this.active = true;
        this.isWhite = isWhite;
    }

    public Checkers(){

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
        return String.format(" O  ");
    }

    public void move(int x, int y){
        int diffX = this.posX - x;
        int diffY = this.posY - y;

        int aux = x+y;
        if ( (diffX!=0 && diffY != 0) && (aux == Math.abs(2) || aux ==0) ) {
            setPosY(y);
            setPosX(x);
            System.out.println("move setted");
        }else {
            System.out.println("cannot go there");
        }

    }

}
