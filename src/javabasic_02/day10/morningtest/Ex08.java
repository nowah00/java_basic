package javabasic_02.day10.morningtest;

public class Ex08 {

    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        int totalSum = 0;
        double average = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
                count++;
            }
        }
        average = (double) totalSum / count;
        System.out.println(totalSum + " " + average);
    }
}
