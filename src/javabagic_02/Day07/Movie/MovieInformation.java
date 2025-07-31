package javabagic_02.Day07.Movie;

public class MovieInformation {
    public static void main(String[] args) {
        Movie 아바타 = new Movie();
        아바타.title = "아바타";
        아바타.release_date = 20221214;
        아바타.hero = "제이크 설리";
        아바타.genre = "액션";
        아바타.running_time = 192;
        아바타.rating = 12;

        System.out.println(아바타.title);
        System.out.println(아바타.release_date);
        System.out.println(아바타.hero);
        System.out.println(아바타.genre);
        System.out.println(아바타.running_time);
        System.out.println(아바타.rating);
    }
}
