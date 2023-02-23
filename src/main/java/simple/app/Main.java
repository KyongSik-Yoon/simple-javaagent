package simple.app;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("simple app is running!");

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> {
            System.out.println(Arrays.toString(HttpServletRequest.class.getInterfaces()));
        }, 0, 1, TimeUnit.SECONDS);
    }
}
