package risorsa;

public class Task implements Runnable {

    private Risorsa risorsa1;
    private Risorsa risorsa2;

    public Task(Risorsa risorsa) {
        this.risorsa1 = risorsa;
    }

    public Task(Risorsa risorsa1, Risorsa risorsa2) {
        this.risorsa1 = risorsa1;
        this.risorsa2 = risorsa2;
    }

    @Override
    public void run() {
        if (risorsa2 == null) {
            System.err.println(this.risorsa1.name+": Acquiring this resource...");
            risorsa1.acquireResourse();
            risorsa1.releaseResourse();
            System.err.println(this.risorsa1.name+": This resourse has been released");
        } else {
            System.err.println(this.risorsa1.name+": Acquiring this resource...");
            risorsa1.acquireResourse();
            System.err.println(this.risorsa2.name+": Acquiring this resource...");
            risorsa2.acquireResourse();
            risorsa1.releaseResourse();
            System.err.printf(this.risorsa2.name+": This resourse has been released");
            risorsa2.releaseResourse();
            System.err.printf(this.risorsa2.name+": This resourse has been released");
        }
    }
}
