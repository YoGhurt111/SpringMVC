package soundsystem;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "hahah";
    private String artist = "yoghurt";
    public void play(){
        System.out.println("Playing " + title + "by" + artist);
    }
}
