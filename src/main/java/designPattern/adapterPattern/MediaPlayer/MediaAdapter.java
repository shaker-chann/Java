package designPattern.adapterPattern.MediaPlayer;

import designPattern.adapterPattern.AdvancedMediaPlayer.AdvancedMediaPlayer;
import designPattern.adapterPattern.AdvancedMediaPlayer.Mp4Player;
import designPattern.adapterPattern.AdvancedMediaPlayer.VlcPlayer;

/**
 * @Description:
 * @PackageName: designPattern.adapterPattern
 * @Author: csc
 * @Create: 2020-08-14 16:20
 * @Version: 1.0
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
