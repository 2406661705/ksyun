package practice3;

public class ThreeThreads extends Thread {

        private static Object lock = new Object();
        private static int count = 0;
        private int id;
        private int rounds;

        public ThreeThreads(int id, int rounds) {
            this.id = id;
            this.rounds = rounds;
        }

        @Override
        public void run() {
            for (int i = 0; i < rounds; i++) {
                synchronized (lock) {
                    while (id != count % 3) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print((char) ('A' + id));
                    count++;
                    lock.notifyAll();
                }
            }
        }
}
