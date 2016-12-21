package test.java.util.concurrent.countdownlatch.my.demo;

/**
 * Created by wuxing
 */
public class MainTest {
    public static void main(String[] args) {
        boolean result = false;
        try {
            result = ApplicationStartupUtil.checkExternalServices();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("External services validation completed !! Result was :: " + result);
    }
}