package javabasic_02.day09.oop;

public class Scores { // main 에서 new Scores 형식으로 점수를 setScore 에 저장
    private String kor;
    private String eng;
    private String math;

    Scores() { }

    Scores(String kor, String eng, String math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() { //StudentMain 에서 Scores 에 저장되어 있는 점수 값을 이 메서드로 계산하여 메인 out 으로 나가게 됌.
        return Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public void printScores() {
        System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
    }
}
