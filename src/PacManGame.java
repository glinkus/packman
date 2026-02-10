import Bridge.PreGameMusic;
import SoundAdapter.MP3Adapter;
import SoundAdapter.SoundPlayer;
import ui.Menu;
import Bridge.BackgroundSound;

public class PacManGame {
    public static void main(String[] args) {
        BackgroundSound backgroundSound = new PreGameMusic();
        backgroundSound.play();

        Menu menu = new Menu(backgroundSound);
        menu.display();
    }
}
