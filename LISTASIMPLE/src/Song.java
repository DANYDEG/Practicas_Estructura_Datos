public class Song {
    private String title;
    private String artist;
    private int year;
    private boolean like;

    public Song(String t, String a){
        this.title = t;
        this.artist = a;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isLike() {
        return like;
    }
    public void setLike(boolean like) {
        this.like = like;
    }
    
}
