package java_basic.homework.PolymorphismProb.prob2;

public class Video extends Content {
    private String genre;

    Video(String name, String genre){
        super(name);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    void totalPrice() {
        if (this.genre.equals("new")){
            this.setPrice(2000);
        } else if (this.genre.equals("comic")){
            this.setPrice(1500);
        } else if (this.genre.equals("child")){
            this.setPrice(1000);
        } else {
            this.setPrice(500);
        }
    }
}
