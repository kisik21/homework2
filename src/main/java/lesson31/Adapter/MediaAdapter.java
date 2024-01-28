package lesson31.Adapter;

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".vlc")) {
            advancedMediaPlayer.playVlc(filename);
        } else if (filename.endsWith(".mp4")) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}