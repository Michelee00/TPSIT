package risorsa;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Risorsa {

    static final Random random = new Random((new Date()).getTime());
    private final Semaphore semaphore;
    String name;

    public Risorsa(String name) {
        this.name = name;
        this.semaphore = new Semaphore(1);
    }

    public void acquireResourse() {
        try {
            semaphore.acquire();
            int duration = 1 + random.nextInt(4);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
        }
    }

    public void releaseResourse() {
        semaphore.release();
    }
}
