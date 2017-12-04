package risorsa;

public class Simul_1 {

    public static void main(String[] args) {
        Risorsa r = new Risorsa("Resource");
        Thread t1 = new Thread(new Task(r), "Thread1");
        Thread t2 = new Thread(new Task(r), "Thread2");
        t1.start();
        t2.start();
    }

}
