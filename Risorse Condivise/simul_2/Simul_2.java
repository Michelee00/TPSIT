package simul_2;

import static simul_2.Risorsa.s;

public class Simul_2 {

    public static void main(String[] args) {
        System.out.println("Risorse disponibili di entrambi i thread assieme adesso: " + s.availablePermits());
        Task t2 = new Task("B");
        Task t1 = new Task("A");

        t1.start();
        t2.start();
    }

}
