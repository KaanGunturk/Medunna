package hooks;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigReader;

public class Hooks extends ConfigReader {
    protected RequestSpecification spec;

    @Before
    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();

    }


  /*  @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        //Driver.closeDriver();

    }

   */
}
