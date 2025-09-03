package java_basic_02.day11.test250806.test01;

public class Movie {
    private String title;
    private String genre;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play() {
        System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
    }
}
