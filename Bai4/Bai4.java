package ss25.Bai4;

public class Bai4 {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter("mp4");
        player.play("mp4", "video.mp4");

        player = new MediaAdapter("vlc");
        player.play("vlc", "movie.vlc");
    }
}
