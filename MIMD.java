public class MIMD {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Task 1: " + (5 * 2));
        };

        Runnable task2 = () -> {
            System.out.println("Task 2: " + (3 + 2));
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
