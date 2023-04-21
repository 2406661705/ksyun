package practice3;

import org.junit.Test;

public class ThreeThreadsTest {

        @Test
        public void testThreeThreads() {
            ThreeThreads t1 = new ThreeThreads(0, 5);
            ThreeThreads t2 = new ThreeThreads(1, 5);
            ThreeThreads t3 = new ThreeThreads(2, 5);

            t1.start();
            t2.start();
            t3.start();

            try {
                t3.join();
                t2.join();
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
