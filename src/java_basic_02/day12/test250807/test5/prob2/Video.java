package java_basic_02.day12.test250807.test5.prob2;

public class Video extends Content {
    private String genre;

    public Video(String title, String genre) {
        super(title);
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
        switch (getGenre()) {
            case "new" -> {
                setPrice(2000);
            }
            case "comic" -> {
                setPrice(1500);
            }
            case "child" -> {
                setPrice(1000);
            }
            default -> {
                setPrice(500);
            }
        }
    }
}
