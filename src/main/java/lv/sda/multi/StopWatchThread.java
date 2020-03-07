package lv.sda.multi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopWatchThread extends Thread {
    static Logger log = LoggerFactory.getLogger(StopWatchThread.class);

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            log.info("Another Thread Stop watch: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
