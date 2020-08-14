package designPattern.adapterPattern.AdvancedMediaPlayer;

/**
 * @Description:
 * @PackageName: designPattern.adapterPattern
 * @Author: csc
 * @Create: 2020-08-14 16:19
 * @Version: 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
