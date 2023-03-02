package mythread;

public class FindCountSimpleNumberThread extends Thread {
    private int[] array;
    private int begin, end, countSimpleNumber = 0;

    public FindCountSimpleNumberThread(int[] array, int begin, int end) {
        this.array = array;
        this.begin = begin;
        this.end = end;
    }

    private boolean isSimpleNumber(int number) {
        int firstSimpleNumber = 2;
        if (number < 2) {
            return false;
        }
        for (int i = number > firstSimpleNumber ? firstSimpleNumber : firstSimpleNumber + 1; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println(String.format("Thread started in range %d-%d", begin, end - 1));
        for (int i = begin; i < end; ++i) {
            if (isSimpleNumber(array[i])) {
                ++countSimpleNumber;
            }
        }
    }

    public int getCountSimpleNumber() {
        return countSimpleNumber;
    }
}
