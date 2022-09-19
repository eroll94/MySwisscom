import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SmokeTestAndroid extends TestBase {

    @Test
    public void startAndroid() throws MalformedURLException {
        androidSetup();
    }

}
