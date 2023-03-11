package main;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client1 = new Client(5000, 1234, "Stas");
        Client client2 = new Client(5000, 125, "Petya");
        final int size = 200;
        DeadlockTask[] tasks = new DeadlockTask[size];
        for (int i = 0; i < size; ++i) {
            if (i % 2 == 0) {
                tasks[i] = new DeadlockTask("first", client1, client2, 1);
            } else {
                tasks[i] = new DeadlockTask("second", client2, client1, 1);
            }
        }
        for (int i = 0; i < size; ++i) {
            tasks[i].start();
            tasks[i].join();
        }
    }
}