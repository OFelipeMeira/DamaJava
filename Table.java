public class Table {

    Checkers[][] table = new Checkers[8][8];
    int count = 0;

    void create(){
        count = 0;
        for(int i = 0 ; i <8 ;i++) {
            for (int j = 0; j < 8; j++) {
                count += 1;
            }
        }
    }

    void addChecker(Checkers checkers){
        int posX =checkers.getPosX();
        int posY =checkers.getPosY();
        table[posX][posY] = checkers;
    }


}
