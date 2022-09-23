package myPractiseExercises;

public class ExAndOo {

    public static void main(String[] args) {


//        char[][] threeD_arr = new char[][];
//
//        for (int i = 0; i < 3; i++){
//
//            for (int j = 0; j < 3; j++){
//
//                System.out.println(threeD_arr[i][j]);
//            }
//            System.out.println();
//        }

        String[][] game = {
                        {"X","|", "O", "|", "X"},
                        {"O","|", "X","|","O"},
                        {"X","|", "X","|", "O"}
        };

        for (int i = 0; i < game.length; i++) {

            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]+" ");
            }
            System.out.println();
        }

    }

}
