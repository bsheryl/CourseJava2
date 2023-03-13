package main.task65;

public class Message {
    private String s;

    public Message(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Message{" +
                "s='" + s + '\'' +
                '}';
    }

    public int getHammingDistance(String base) {
        char[] sc = s.toCharArray();
        char[] basec = base.toCharArray();
        int distance  = 0;
        for (int i = 0; i < sc.length; ++i) {
            distance += sc[i] == basec[i] ? 0 : 1;
        }
        return distance;
    }
}
