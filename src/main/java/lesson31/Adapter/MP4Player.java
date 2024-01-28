package lesson31.Adapter;

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        // Do nothing. This player only supports mp4 files
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: " + filename);
    }
}
