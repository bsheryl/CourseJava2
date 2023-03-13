package main.task65;

import java.util.Comparator;

public class MessageComparator implements Comparator<Message> {
    @Override
    public int compare(Message o1, Message o2) {
        char[] ar1 = o1.getS().toCharArray();
        char[] ar2 = o2.getS().toCharArray();
        int distance = 0;
        for (int i = 0; i < ar1.length; ++i) {
            distance += ar1[i] == ar2[i] ? 0 : 1;
        }
        return distance;
    }
}
