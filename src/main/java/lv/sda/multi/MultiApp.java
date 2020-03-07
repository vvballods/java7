package lv.sda.multi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiApp {
    static Logger log = LoggerFactory.getLogger(MultiApp.class);

    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatchThread = new StopWatchThread();
        StopWatchThread stopWatchThread2 = new StopWatchThread();
        stopWatchThread.start();
        stopWatchThread2.start();
        log.info("Main thread starts");
        Thread.sleep(5000);
        log.info("Main thread is still running");
        Thread.sleep(5000);
        log.info("Main thread ends");
    }
}
