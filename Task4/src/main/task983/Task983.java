package main.task983;

import main.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task983 implements Task {
    private int n;
    private ArrayList<Human> humans;
    private ArrayList<Integer> times;
    @Override
    public void readInputData() {
        try (Scanner sc = new Scanner(new File("src\\main\\task983\\input1.txt"))) {
            n = Integer.parseInt(sc.nextLine());
            humans = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                Integer[] tw = Arrays.stream(
                        sc.nextLine().split(" ")
                ).map(
                        Integer::parseInt
                ).toArray(Integer[]::new);
                Human human = new Human(tw[0], tw[1]);
                humans.add(human);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void executeTask() {
        readInputData();
        times = new ArrayList<>();
        times.add(humans.get(0).getTimeRunning());
        humans.stream().skip(1).forEach(
                x->times.add(Math.max(x.getTimeRunning(), humans.get(humans.indexOf(x) - 1).getTimeRunning()))
        );
        times.stream().forEach(System.out::println);
    }
}
