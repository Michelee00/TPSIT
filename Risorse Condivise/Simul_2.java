package risorsa;

public class Simul_2 {

    public static void main(String[] args) {
        Risorsa r1 = new Risorsa("Resource 1");
        Risorsa r2 = new Risorsa("Resource 2");
        Thread t1 = new Thread(new Task(r1, r2), "Thread1");
        Thread t2 = new Thread(new Task(r1, r2), "Thread2");
        t1.start();
        t2.start();
    }

}
