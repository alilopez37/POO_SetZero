import models.SetZero;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        short filas;
        short cols;
        short[][] array;

        System.out.println("Filas: ");
        filas = keyboard.nextShort();
        System.out.println("Cols: ");
        cols = keyboard.nextShort();
        array = new short[filas][cols];
        for (short i=0;i<filas;i++)
            for (short j=0;j<cols;j++) {
                System.out.println("array["+i+"]["+j+"]: ");
                array[i][j] = keyboard.nextShort();
            }
        SetZero object = new SetZero();
        object.setData(array);
        object.run();
        for (short i=0;i<filas;i++) {
            System.out.println();
            for (short j = 0; j < cols; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}