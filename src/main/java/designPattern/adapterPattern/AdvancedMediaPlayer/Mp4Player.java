package designPattern.adapterPattern.AdvancedMediaPlayer;

/**
 * @Description:
 * @PackageName: designPattern.adapterPattern
 * @Author: csc
 * @Create: 2020-08-14 16:19
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
