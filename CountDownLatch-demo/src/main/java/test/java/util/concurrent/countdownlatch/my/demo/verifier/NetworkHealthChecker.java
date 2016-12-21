package test.java.util.concurrent.countdownlatch.my.demo.verifier;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wuxing
 * 这个类继承了BaseHealthChecker，实现了verifyService()方法。DatabaseHealthChecker.java和CacheHealthChecker.java除了服务名和休眠时间外，与NetworkHealthChecker.java是一样的。
 */
public class NetworkHealthChecker extends BaseHealthChecker {
    public NetworkHealthChecker(CountDownLatch latch) {
        super("Network Service", latch);
    }

    @Override
    public void verifyService() {
        System.out.println("Checking " + this.getServiceName());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }
}