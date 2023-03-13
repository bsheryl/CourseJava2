package main.task65;

import main.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Task65 implements Task {
    private String s;
    private int n, k = 0;
    ArrayList<Message> messages;
    ArrayList<Integer> distances;
    @Override
    public void readInputData() {
        try (Scanner sc = new Scanner(new File("src\\main\\task65\\input1.txt"))) {
            s = sc.nextLine();
            n = Integer.parseInt(sc.nextLine());
            messages = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                messages.add(new Message(sc.nextLine()));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void executeTask() {
        readInputData();
        distances = new ArrayList<>();
        Stream<Message> smessage = messages.stream();
        k = smessage.min(new MessageComparator()).get().getHammingDistance(s);
        System.out.println(k);
        messages.stream().filter(x -> x.getHammingDistance(s) == k)
                .forEach(x -> System.out.print(messages.indexOf(x) + 1 + " "));
    }
}
