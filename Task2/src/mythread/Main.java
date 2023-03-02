package mythread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int numberOfThreads = 4;
        final int size = 10000000;
        int[] array = new int[size];
        int countSimpleNumber = 0;

        for (int i = 0; i < size; ++i) {
            array[i] = i;
        }

        int numberOfElementsInThread = array.length / numberOfThreads;
        FindCountSimpleNumberThread[] threads = new FindCountSimpleNumberThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; ++i) {
            int begin = i * numberOfElementsInThread;
            int end = (i + 1) * numberOfElementsInThread;
            if (end > array.length - 1) {
                end = array.length;
            }
            threads[i] = new FindCountSimpleNumberThread(array, begin, end);
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; ++i) {
            threads[i].join();
        }

        for (int i = 0; i < numberOfThreads; ++i) {
            countSimpleNumber += threads[i].getCountSimpleNumber();
        }

        System.out.println("Количество простых чисел: " + countSimpleNumber);
    }
}