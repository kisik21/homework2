package lesson31.Adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter("vlc");
        mediaPlayer.play("sample.vlc");

        mediaPlayer = new MediaAdapter("mp4");
        mediaPlayer.play("sample.mp4");
    }
}