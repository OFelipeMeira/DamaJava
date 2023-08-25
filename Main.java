import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Precisa Preencher toda a matrix com Checkers, evitando null
        // Adicionar uma formula para preencher auto a lista de objectos 'list'
        // 

        Scanner sc = new Scanner(System.in);

        // Creating aux variables
        int posY;
        int posX;



        ArrayList<Checkers> list = new ArrayList<>();

        // Creating all the Checkers
        Checkers b1  = new Checkers(0,0, true);
        Checkers b2  = new Checkers(0,2, true);
        Checkers b3  = new Checkers(0,4, true);
        Checkers b4  = new Checkers(0,6, true);
        Checkers b5  = new Checkers(1,1, true);
        Checkers b6  = new Checkers(1,3, true);
        Checkers b7  = new Checkers(1,5, true);
        Checkers b8  = new Checkers(1,7, true);
        Checkers b9  = new Checkers(2,0, true);
        Checkers b10 = new Checkers(2,2, true);
        Checkers b11 = new Checkers(2,4, true);
        Checkers b12 = new Checkers(2,6, true);

        // Settin up a list to have controll of each checker
        while (true) {
            // Creating the table:
            Table table = new Table();

            list.add(b1);
            list.add(b2);
            list.add(b3);
            list.add(b4);
            list.add(b5);
            list.add(b6);
            list.add(b7);
            list.add(b8);
            list.add(b9);
            list.add(b10);
            list.add(b11);
            list.add(b12);

            // Inserting each checker into the table
            for (Checkers check:list ) {
                table.addChecker(check);
            }


            System.out.println("\n\n\n----------------------------------------\n\n");
            table.show();

            System.out.println("Digite a peça a ser movida");
            System.out.println("Pos X: ");
            posX = sc.nextInt();
            System.out.println("Pos Y: ");
            posY = sc.nextInt();

            Checkers auxChecker = table.getChecker(posX, posY);

            System.out.println("Digite a posição final: ");
            System.out.println("Pos X: ");
            posX = sc.nextInt();
            System.out.println("Pos Y: ");
            posY = sc.nextInt();
            if (table.tryMove(auxChecker, posX, posY)){
                System.out.println("new PosX:" + auxChecker.getPosX());
                System.out.println("new PosY:" + auxChecker.getPosY());

                list.remove(auxChecker);
            }else{
                System.out.println("ERROR IN MOVEMENT");
            }

            list.clear();

        }

  }
}