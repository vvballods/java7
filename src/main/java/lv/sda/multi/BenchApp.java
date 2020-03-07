package lv.sda.multi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenchApp {
    static Logger log = LoggerFactory.getLogger(BenchApp.class);

    public static void main(String[] args) throws InterruptedException {
        Bench bench = new Bench(1); // creating bench with one free seat
        log.info("Created bench on main thread");
        SeatTakerThread seatTaker1 = new SeatTakerThread(bench);
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench);
        seatTaker1.start();
        seatTaker2.start();
        log.info("Finished work on main thread");
    }
}
