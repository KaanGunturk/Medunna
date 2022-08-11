package utilities;

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
}
