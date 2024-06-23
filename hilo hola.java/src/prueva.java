public class prueva extends Thread {

    public void run() {
        while (true) {
            try {
                System.out.println("hola");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("algo anda mal");
            }
        }
    }
}
