package Bridge;
import SoundAdapter.SoundPlayer;
import SoundAdapter.MP3Adapter;

public class PreGameMusic extends BackgroundSound {
    public PreGameMusic() {
        SoundPlayer player = new MP3Adapter();
        super(player);
    }

    @Override
    public void play() {
        player.play("sounds/intro.mp3");    // Simplified play without fileName parameter
    }

    @Override
    public void stop() {
        player.stop();
    }

    @Override
    public void setLooping(boolean loop) {
        player.setLooping(loop);
    }
}
