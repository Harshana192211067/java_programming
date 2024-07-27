    public class m21_fib implements Runnable {
        private int n;
        public m21_fib(int n) {
            this.n = n;}
        public void run() {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series up to " + n + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;}}

        public static void main(String[] args) {
            int n = 5; // Sample input
            m21_fib fibonacciRunnable = new m21_fib(n);
            Thread thread = new Thread(fibonacciRunnable);
            thread.start();}}


