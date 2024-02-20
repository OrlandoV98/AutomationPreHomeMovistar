import WebSite.WebSite;
import org.testng.annotations.Test;

public class ExcuteTest {

    @Test
    public void Execute() throws InterruptedException {

        WebSite webSite = new WebSite();
        webSite.OpenWebSite();

    }

}
