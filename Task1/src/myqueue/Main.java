package myqueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println("Добавим элементы 1-5");
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.printQueue();
        System.out.println("Выведем первый и последний элементы");
        System.out.println(myQueue.getFirst().getValue());
        System.out.println(myQueue.getLast().getValue());
        System.out.println("Вытащим два первых элемента");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println("Проверим размер очереди: " + myQueue.getSize());
        System.out.println("В очереди должны остаться элементы 3-5");
        myQueue.printQueue();
        System.out.println("Проверим первый и последний элементы");
        System.out.println(myQueue.getFirst().getValue());
        System.out.println(myQueue.getLast().getValue());
    }
}
