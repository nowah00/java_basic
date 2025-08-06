package javabasic_02.day07;

public class DoubleArrayEx01 {

    public static void main(String[] args) {

    // 학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 벼열을 만들어라
        int[][] scores = new int [3][3];

    // 1번 학생의 국어:90 영어:50 수학:80을 저장하고 출력하세요.
        scores[0][0] = 90; // 국어
        scores[0][1] = 50; // 영어
        scores[0][2] = 80; // 수학

    // 2번 학생의 국어:80 영어:100 수학:90 을 저장하고 출력하세요.
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

    // 3번 학생의 국어:100 영어:90 수학:90 을 저장하고 출력하세요.
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

    // 각 학생들의 국어, 영어, 수학 점수를 학생별로 출력하세요.
        int student = 1;
        int total = 0;
        int avg = 0;
        int count = 0; // 평균을 구하기 위한 카운트
        int subjects = 1; // 과목

        for (int i = 0; i < scores.length; i++) {
            System.out.println(student + "번째 학생"); // 몇 번째 학생인지

            for (int j = 0; j < scores.length; j++) {
                total += scores[i][j];

                if (subjects==1){ // 과목명
                    System.out.print("kor : ");
                } else if (subjects==2) {
                    System.out.print("eng : ");
                } else if (subjects==3){
                    System.out.print("math : ");
                }

                System.out.println(scores[i][j]);
                count++;
                subjects++;
            }
            student++;
            avg = total / count;
            System.out.printf("total : %d \navg : %d\n\n", total, avg);
            total = 0;
            avg = 0;
            count = 0;
            subjects=1;
        }
    }
}
