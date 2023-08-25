import java.util.ArrayList;

public class Table {

    private Checkers[][] table = new Checkers[8][8];
    int count = 0;

    @Override
    public String toString() {
        return " ";
    }

    void addChecker(Checkers checkers){
        int posX =checkers.getPosX();
        int posY =checkers.getPosY();
        table[posX][posY] = checkers;
    }

    void show(){
        for (int i =0 ;i<8;i++){
            for (int j =0 ;j<8;j++){
                Checkers aux = table[i][j];
                if (aux == null){
                    if (j != 7) {
                        System.out.print("| " + "    ");
                    } else {
                        System.out.print("| " + "    " + "|");
                    }
                }else {
                    if (j != 7) {
                        System.out.print("| " + table[i][j]);
                    } else {
                        System.out.print("| " + table[i][j] + "|");
                    }
                }
            }
            System.out.println();
            for(int k = 0; k<50;k++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    Checkers getChecker(int posX, int posY){
        for (Checkers[] row:table) {
            for (Checkers check: row ) {
                if(check != null) {
                    if (check.getPosY() == posY && check.getPosX() == posX) {
                        return check;
                    }
                }
            }
        }
        return null;
    }

    boolean tryMove(Checkers check, int posX, int posY){
        if (table[posX][posY] == null){
            check.move(posX,posY);
            return true;
        }else{
            return false;
        }
    }


}
