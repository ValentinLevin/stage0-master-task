package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int col = cathetusLength; col >= 1; col--) {
                if (col <= row) {
                    System.out.print(col);
                } else {
                    System.out.print(' ');
                }
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
