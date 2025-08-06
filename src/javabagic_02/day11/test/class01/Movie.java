package javabagic_02.day11.test.class01;

public class Movie {
    private String title;
    private String genre;

    public Movie (){}

    Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play(){
        System.out.println(title + "(" + genre + ") 상영중입니다.");
    }
}
