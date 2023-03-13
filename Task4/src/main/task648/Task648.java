package main.task648;

import main.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task648 implements Task {
    private String path;
    private int n;
    private ArrayList<Integer> maxScores;
    private ArrayList<Integer> a;
    public Task648(String path) {
        this.path = path;
    }

    @Override
    public void readInputData() {
        try (Scanner sc = new Scanner(new File(path))) {
            n = Integer.parseInt(sc.nextLine());
            a = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                a.add(sc.nextInt());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void executeTask() {
        readInputData();
        maxScores = new ArrayList<>();
        for (int i = 0; i < n / 2; ++i) {
            a.stream().max(Comparator.naturalOrder()).map(x->maxScores.add(a.remove(a.indexOf(x))));
        }
        int shrek = maxScores.stream().reduce((x, y) -> x + y).get();

        int croupier = a.stream().reduce((x, y) -> x + y).get();
        System.out.println(shrek - croupier);
    }
}
