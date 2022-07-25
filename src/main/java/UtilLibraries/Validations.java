package UtilLibraries;
import org.testng.Assert;

public class Validations {

    public static boolean ValidationOperation(String Expected,String actual){
        try{
             Assert.assertEquals(Expected,actual);
             return true;
        }
        catch (AssertionError e)
        {
            return false;
        }
    }
}
