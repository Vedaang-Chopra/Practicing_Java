
class A1 extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                yield();
            }
            System.out.println("from thread A1 : i = " + i);

        }
        System.out.println("exit from A1");
    }
}

class B1 extends Thread {

    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("from thread B1 : j = " + j);
            if (j == 3) {
                stop();
            }

        }
        System.out.println("exit from B1");
    }
}

class C2 extends Thread {

    public void run() {
        for (int k = 0; k <= 5; k++) {
            System.out.println("from thread C2 : k= " + k);
            if (k == 1) {
                try {
                    sleep(5000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println("exit from C2");
    }
}

public class ThreadMethods {

    public static void main(String args[]) {
        A1 a = new A1();
        System.out.println("start thread A1");
        a.start();
        B1 b = new B1();
        System.out.println("start thread B1");
        b.start();
        C2 c = new C2();
        System.out.println("start thread C2");
        c.start();
        System.out.println("END OF MAIN THREAD");
    }
}
