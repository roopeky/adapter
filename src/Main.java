public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "despacito.mp3");
        audioPlayer.play("mp4", "baby.mp4");
        audioPlayer.play("vlc", "stopbreathing.vlc");
        audioPlayer.play("avi", "maammelaulu.avi");
    }
}