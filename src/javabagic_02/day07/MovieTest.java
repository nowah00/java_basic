package javabagic_02.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie 아바타 = new Movie();
        아바타.title = "아바타";
        아바타.release_date = 20221214;
        아바타.hero = "제이크 설리";
        아바타.genre = "액션";
        아바타.running_time = 192;
        아바타.rating = 12;

        Movie 트랜스포머 = new Movie();
        트랜스포머.title = "트랜스포머";

        Movie 드래곤길들이기 = new Movie();
        드래곤길들이기.title = "드래곤길들이기";


        Movie[] movieList = new Movie[3];
        movieList[0] = 아바타;
        movieList[1] = 트랜스포머;
        movieList[2] = 드래곤길들이기;

        System.out.println("01 Movie Title : " + movieList[0]);
        System.out.println("02 Movie Title : " + movieList[1]);
        System.out.println("03 Movie Title : " + movieList[2]);

        for (Movie movie : movieList) {
            System.out.println(movie.title);
        }

        for (int i = 0; i < movieList.length; i++) {
            Movie movie = movieList[i];
            System.out.println(movie.title);
        }



    }
}
