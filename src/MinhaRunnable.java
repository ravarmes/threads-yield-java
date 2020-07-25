
public class MinhaRunnable implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " rodando");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            // passando o controle para outra thread implicitamente
            Thread.yield();
        }
        System.out.println(name + " FIM ***");
    }

}
