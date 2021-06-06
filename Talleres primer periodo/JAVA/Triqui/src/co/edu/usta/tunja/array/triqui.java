package co.edu.usta.tunja.array;

import javax.swing.*;

public class triqui {

    public static void main(String[] args) {
        String[][] triqui;
        String size;
        String columns , rows;
        String column_player_1, row_player_1;
        String column_player_2, row_player_2;
        int X=0, O=0, Vacios=9;
        //ELEGIR EL TIPO DE MATRIS
        size = JOptionPane.showInputDialog("""
                Hello please input the size of the triqui,\s
                 1) 3x3\s
                 2) 5x5""");
        while(Integer.parseInt(size)<1 || Integer.parseInt(size)>2){
            JOptionPane.showMessageDialog(null, "The size is out of limits please input again the size ");
            size = JOptionPane.showInputDialog("""
                Hello please input the size of the triqui,\s
                 1) 3x3\s
                 2) 5x5""");
        }
        //TRIQUI 3X3
        if (Integer.parseInt(size) == 1) {
            columns = "3";
            rows = "3";
            //INICIALIZAR LA MATRIS
            triqui = new String[Integer.parseInt(rows)][Integer.parseInt(columns)];
            for (int i = 0; i < triqui.length; i++) {
                for (int j = 0; j < triqui[0].length; j++) {
                    triqui[i][j] = "[_]";
                }
            }
            impresion_1(triqui,rows,columns);

            //PEDIR CASILLAS DE CADA JUGADOR INDIVIDUALMENTE POR SU NOMBRE
            String Player_1;
            Player_1 = JOptionPane.showInputDialog("Please input the name of player 1");
            String Player_2;
            Player_2 = JOptionPane.showInputDialog("Please input the name of player 2");
            while(Vacios>0&&Vacios<10){
                row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");

                while (Integer.parseInt(column_player_1) < 0 || Integer.parseInt(column_player_1) > 2 || Integer.parseInt(row_player_1) < 0 || Integer.parseInt(row_player_1) > 2) {
                    JOptionPane.showMessageDialog(null, "The number is out of limit, input again");
                    row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                    column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");
                }
                for (int i = 0; i < Integer.parseInt(rows); i++) {
                    for (int j = 0; j < Integer.parseInt(columns); j++) {
                        while (triqui[Integer.parseInt(row_player_1)][Integer.parseInt(column_player_1)] == "[O]") {
                            JOptionPane.showMessageDialog(null, "The box is fill, please mark another box");
                            row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                            column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");
                        }
                    }
                    triqui[Integer.parseInt(row_player_1)][Integer.parseInt(column_player_1)] = "[X]";
                }

                JOptionPane.showMessageDialog(null, impresión_2(triqui,rows,columns));

                if (ganador_3_x_3(triqui,rows,columns)==1){
                    JOptionPane.showMessageDialog(null, Player_1+" WINS");
                    System.exit(0);
                }
                if (ganador_3_x_3(triqui,rows,columns)==2){
                    JOptionPane.showMessageDialog(null, Player_2+" WINS");
                    System.exit(0);
                }
                if (ganador_3_x_3(triqui,rows,columns)==3){
                    JOptionPane.showMessageDialog(null, "NEXT PLAYER");
                }

                row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of column that you want to mark");

                while (Integer.parseInt(column_player_2) < 0 || Integer.parseInt(column_player_2) > 2 || Integer.parseInt(row_player_2) < 0 || Integer.parseInt(row_player_2) > 2) {
                    JOptionPane.showMessageDialog(null, "The number is out of limit, input again");
                    row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                    column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number" +
                            " of column that you want to mark");
                }

                for (int i = 0; i < Integer.parseInt(rows); i++) {
                    for (int j = 0; j < Integer.parseInt(columns); j++) {
                        while (triqui[Integer.parseInt(row_player_2)][Integer.parseInt(column_player_2)] == "[X]") {
                            JOptionPane.showMessageDialog(null, "The box is fill, please mark another box");
                            row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                            column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of column that you want to mark");
                        }
                    }
                    triqui[Integer.parseInt(row_player_2)][Integer.parseInt(column_player_2)] = "[O]";
                }

                JOptionPane.showMessageDialog(null, impresión_2(triqui,rows,columns));
                if (ganador_3_x_3(triqui,rows,columns)==1){
                    JOptionPane.showMessageDialog(null, Player_1+" WINS");
                    System.exit(0);
                }
                if (ganador_3_x_3(triqui,rows,columns)==2){
                    JOptionPane.showMessageDialog(null, Player_2+" WINS");
                    System.exit(0);
                }
                if (ganador_3_x_3(triqui,rows,columns)==3){
                    JOptionPane.showMessageDialog(null, "NEXT PLAYER");
                }

                Vacios=Vacios-2;
            }

            if(Vacios<=0){
                JOptionPane.showMessageDialog(null, "Both lose");
            }
        }
        //TRIQUI 5X5
        if (Integer.parseInt(size) == 2) {
            columns = "5";
            rows = "5";
            //INICIALIZAR LA MATRIS
            triqui = new String[Integer.parseInt(rows)][Integer.parseInt(columns)];
            for (int i = 0; i < triqui.length; i++) {
                for (int j = 0; j < triqui[0].length; j++) {
                    triqui[i][j] = "[_]";
                }
            }
            impresion_1(triqui,rows,columns);

            //PEDIR CASILLAS DE CADA JUGADOR INDIVIDUALMENTE POR SU NOMBRE
            String Player_1;
            Player_1 = JOptionPane.showInputDialog("Please input the name of player 1");
            String Player_2;
            Player_2 = JOptionPane.showInputDialog("Please input the name of player 2");
            while(Vacios>0&&Vacios<26){
                row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");


                while (Integer.parseInt(column_player_1) < 0 || Integer.parseInt(column_player_1) > 4 || Integer.parseInt(row_player_1) < 0 || Integer.parseInt(row_player_1) > 4) {
                    JOptionPane.showMessageDialog(null, "The number is out of limit, input again");
                    row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                    column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");
                }
                for (int i = 0; i < Integer.parseInt(rows); i++) {
                    for (int j = 0; j < Integer.parseInt(columns); j++) {
                        while (triqui[Integer.parseInt(row_player_1)][Integer.parseInt(column_player_1)] == "[O]") {
                            JOptionPane.showMessageDialog(null, "The box is fill, please mark another box");
                            row_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of row that you want to mark");
                            column_player_1 = JOptionPane.showInputDialog(Player_1 + " Please input the number of column that you want to mark");
                        }
                    }
                    triqui[Integer.parseInt(row_player_1)][Integer.parseInt(column_player_1)] = "[X]";
                }

                JOptionPane.showMessageDialog(null, impresión_2(triqui,rows,columns));

                if (ganador_5_x_5(triqui,rows,columns)==1){
                    JOptionPane.showMessageDialog(null, Player_1+" WINS");
                    System.exit(0);
                }
                if (ganador_5_x_5(triqui,rows,columns)==2){
                    JOptionPane.showMessageDialog(null, Player_2+" WINS");
                    System.exit(0);
                }
                if (ganador_5_x_5(triqui,rows,columns)==3){
                    JOptionPane.showMessageDialog(null, "NEXT PLAYER");
                }

                row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of column that you want to mark");

                while (Integer.parseInt(column_player_2) < 0 || Integer.parseInt(column_player_2) > 4 || Integer.parseInt(row_player_2) < 0 || Integer.parseInt(row_player_2) > 4) {
                    JOptionPane.showMessageDialog(null, "The number is out of limit, input again");
                    row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                    column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number" +
                            " of column that you want to mark");
                }

                for (int i = 0; i < Integer.parseInt(rows); i++) {
                    for (int j = 0; j < Integer.parseInt(columns); j++) {
                        while (triqui[Integer.parseInt(row_player_2)][Integer.parseInt(column_player_2)] == "[X]") {
                            JOptionPane.showMessageDialog(null, "The box is fill, please mark another box");
                            row_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of row that you want to mark");
                            column_player_2 = JOptionPane.showInputDialog(Player_2 + " Please input the number of column that you want to mark");
                        }
                    }
                    triqui[Integer.parseInt(row_player_2)][Integer.parseInt(column_player_2)] = "[O]";
                }


                JOptionPane.showMessageDialog(null, impresión_2(triqui,rows,columns));
                if (ganador_5_x_5(triqui,rows,columns)==1){
                    JOptionPane.showMessageDialog(null, Player_1+" WINS");
                    System.exit(0);
                }
                if (ganador_5_x_5(triqui,rows,columns)==2){
                    JOptionPane.showMessageDialog(null, Player_2+" WINS");
                    System.exit(0);
                }
                if (ganador_5_x_5(triqui,rows,columns)==3){
                    JOptionPane.showMessageDialog(null, "NEXT PLAYER");
                }

                Vacios=Vacios-2;
            }

            if(Vacios<=0){
                JOptionPane.showMessageDialog(null, "Both lose");
            }
        }
    }
    public static int  ganador_3_x_3(String[][] triqui, String rows, String columns){
        //PUNTAJE GANADOR Y PERDEDOR
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                //Player 1 wins, en horizontales
                if (triqui[0][0] == "[X]" && triqui[0][1] == "[X]" && triqui[0][2] == "[X]" ) {
                    return 1;
                }
                if (triqui[1][0] == "[X]" && triqui[1][1] == "[X]" && triqui[1][2] == "[X]") {
                    return 1;
                }
                if (triqui[2][0] == "[X]" && triqui[2][1] == "[X]" && triqui[2][2] == "[X]") {
                    return 1;
                }
                //Player 1 wins, en verticales
                if (triqui[0][0] == "[X]" && triqui[1][0] == "[X]" && triqui[2][0] == "[X]") {
                    return 1;
                }
                if (triqui[0][1] == "[X]" && triqui[1][1] == "[X]" && triqui[2][1] == "[X]") {
                    return 1;
                }
                if (triqui[0][2] == "[X]" && triqui[1][2] == "[X]" && triqui[2][2] == "[X]") {
                    return 1;
                }
                //Player 1 wins, en diagonales
                if (triqui[0][0] == "[X]" && triqui[1][1] == "[X]" && triqui[2][2] == "[X]") {
                    return 1;
                }
                if (triqui[0][2] == "[X]" && triqui[1][1] == "[X]" && triqui[2][0] == "[X]") {
                    return 1;
                }
                //Player 2 wins, horizontales
                if (triqui[0][0] == "[O]" && triqui[0][1] == "[O]" && triqui[0][2] == "[O]") {
                    return 2;
                }
                if (triqui[1][0] == "[O]" && triqui[1][1] == "[O]" && triqui[1][2] == "[O]") {
                    return 2;
                }
                if (triqui[2][0] == "[O]" && triqui[2][1] == "[O]" && triqui[2][2] == "[O]") {
                    return 2;
                }
                //Player 2 wins, verticales
                if (triqui[0][0] == "[O]" && triqui[1][0] == "[O]" && triqui[2][0] == "[O]") {
                    return 2;
                }
                if (triqui[0][1] == "[O]" && triqui[1][1] == "[O]" && triqui[2][1] == "[O]") {
                    return 2;
                }
                if (triqui[0][2] == "[O]" && triqui[1][2] == "[O]" && triqui[2][2] == "[O]") {
                    return 2;
                }
                //Player 2 wins, diagonales
                if (triqui[0][0] == "[O]" && triqui[1][1] == "[O]" && triqui[2][2] == "[O]") {
                    return 2;
                }
                if (triqui[0][2] == "[O]" && triqui[1][1] == "[O]" && triqui[2][0] == "[O]") {
                    return 2;
                }
            }
        }
        return 3;
    }
    public static int  ganador_5_x_5(String[][] triqui, String rows, String columns){
        //PUNTAJE GANADOR Y PERDEDOR
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                //Player 1 wins, en horizontales
                if (triqui[0][0] == "[X]" && triqui[0][1] == "[X]" && triqui[0][2] == "[X]" && triqui[0][3] == "[X]" && triqui[0][4] == "[X]") {


                    return 1;
                }
                if (triqui[1][0] == "[X]" && triqui[1][1] == "[X]" && triqui[1][2] == "[X]" && triqui[1][3] == "[X]" && triqui[1][4] == "[X]") {
                    return 1;
                }
                if (triqui[2][0] == "[X]" && triqui[2][1] == "[X]" && triqui[2][2] == "[X]" && triqui[2][3] == "[X]" && triqui[2][4] == "[X]") {
                    return 1;
                }
                if (triqui[3][0] == "[X]" && triqui[3][1] == "[X]" && triqui[3][2] == "[X]" && triqui[3][3] == "[X]" && triqui[3][4] == "[X]") {
                    return 1;
                }
                if (triqui[4][0] == "[X]" && triqui[4][1] == "[X]" && triqui[4][2] == "[X]" && triqui[4][3] == "[X]" && triqui[4][4] == "[X]") {
                    return 1;
                }

                //Player 1 wins, en verticales
                if (triqui[0][0] == "[X]" && triqui[1][0] == "[X]" && triqui[2][0] == "[X]" && triqui[3][0] == "[X]" && triqui[4][0] == "[X]") {
                    return 1;
                }
                if (triqui[0][1] == "[X]" && triqui[1][1] == "[X]" && triqui[2][1] == "[X]" && triqui[3][1] == "[X]" && triqui[4][1] == "[X]") {
                    return 1;
                }
                if (triqui[0][2] == "[X]" && triqui[1][2] == "[X]" && triqui[2][2] == "[X]" && triqui[3][2] == "[X]" && triqui[4][2] == "[X]") {
                    return 1;
                }
                if (triqui[0][3] == "[X]" && triqui[1][3] == "[X]" && triqui[2][3] == "[X]" && triqui[3][3] == "[X]" && triqui[4][3] == "[X]") {
                    return 1;
                }
                if (triqui[0][4] == "[X]" && triqui[1][4] == "[X]" && triqui[2][4] == "[X]" && triqui[3][4] == "[X]" && triqui[4][4] == "[X]") {
                    return 1;
                }
                //Player 1 wins, en diagonales
                if (triqui[0][0] == "[X]" && triqui[1][1] == "[X]" && triqui[2][2] == "[X]" && triqui[3][3] == "[X]" && triqui[4][4] == "[X]") {
                    return 1;
                }
                if (triqui[4][0] == "[X]" && triqui[3][4] == "[X]" && triqui[2][2] == "[X]" && triqui[1][3] == "[X]" && triqui[0][4] == "[X]") {
                    return 1;
                }

                //Player 2 wins, horizontales
                if (triqui[0][0] == "[O]" && triqui[0][1] == "[O]" && triqui[0][2] == "[O]" && triqui[0][3] == "[O]" && triqui[0][4] == "[O]") {
                    return 2;
                }
                if (triqui[1][0] == "[O]" && triqui[1][1] == "[O]" && triqui[1][2] == "[O]" && triqui[1][3] == "[O]" && triqui[1][4] == "[O]") {
                    return 2;
                }
                if (triqui[2][0] == "[O]" && triqui[2][1] == "[O]" && triqui[2][2] == "[O]" && triqui[2][3] == "[O]" && triqui[2][4] == "[O]") {
                    return 2;
                }
                if (triqui[3][0] == "[O]" && triqui[3][1] == "[O]" && triqui[3][2] == "[O]" && triqui[3][3] == "[O]" && triqui[3][4] == "[O]") {
                    return 1;
                }
                if (triqui[4][0] == "[O]" && triqui[4][1] == "[O]" && triqui[4][2] == "[O]" && triqui[4][3] == "[O]" && triqui[4][4] == "[O]") {
                    return 1;
                }


//Player 2 wins, verticales
                if (triqui[0][0] == "[O]" && triqui[1][0] == "[O]" && triqui[2][0] == "[O]" && triqui[3][0] == "[O]" && triqui[4][0] == "[O]") {
                    return 2;
                }
                if (triqui[0][1] == "[O]" && triqui[1][1] == "[O]" && triqui[2][1] == "[O]" && triqui[3][1] == "[O]" && triqui[4][1] == "[O]") {
                    return 2;
                }
                if (triqui[0][2] == "[O]" && triqui[1][2] == "[O]" && triqui[2][2] == "[O]" && triqui[3][2] == "[O]" && triqui[4][2] == "[O]") {
                    return 2;
                }
                if (triqui[0][3] == "[O]" && triqui[1][3] == "[O]" && triqui[2][3] == "[O]" && triqui[3][3] == "[O]" && triqui[4][3] == "[O]") {
                    return 1;
                }
                if (triqui[0][4] == "[O]" && triqui[1][4] == "[O]" && triqui[2][4] == "[O]" && triqui[3][4] == "[O]" && triqui[4][4] == "[O]") {
                    return 1;
                }

                //Player 2 wins, diagonales
                if (triqui[0][0] == "[O]" && triqui[1][1] == "[O]" && triqui[2][2] == "[O]" && triqui[3][3] == "[O]" && triqui[4][4] == "[O]") {
                    return 1;
                }
                if (triqui[4][0] == "[O]" && triqui[3][4] == "[O]" && triqui[2][2] == "[O]" && triqui[1][3] == "[O]" && triqui[0][4] == "[O]") {
                    return 1;
                }
            }
        }
        return 3;
    }
    public static String impresión_2(String[][] triqui, String rows, String columns){
        //IMPRIMIR RESULTADO DE LA ASIGNACIÓN
        StringBuilder print_result = new StringBuilder(" ");
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                print_result.append(triqui[i][j]).append(" ");
            }
            print_result.append(" \n ");
        }
        return print_result.toString();
    }
    public static String impresion_1(String[][] triqui, String rows, String columns){
        //IMPRIMIR LA MATRIS
        StringBuilder print = new StringBuilder(" ");
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                print.append(triqui[i][j]).append(" ");
            }
            print.append(" \n ");
        }
        return print.toString();
    }
}