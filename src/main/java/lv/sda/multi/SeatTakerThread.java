package lv.sda.multi;

public class SeatTakerThread extends Thread {
    private Bench bench;

    public SeatTakerThread(Bench bench) {
        this.bench = bench;
    }

    @Override
    public void run() {
        bench.takeASeat();
    }
}
