package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ReusableMethods {

    public static String createSSN (){
        Random rnd=new Random();
        String SSN="";
        int SSN1=rnd.nextInt(899);
        int SSN2=rnd.nextInt(99);
        int SSN3=rnd.nextInt(9999);
        if (SSN1>99&&SSN2>9&&SSN3>999){
            SSN=SSN1+"-"+SSN2+"-"+SSN3;
            return SSN;
        }else if(SSN==null){
            createSSN();
        } else {
            createSSN();
        }
        return SSN;
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
}
