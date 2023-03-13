package main.task983;

public class Human {
    private int t, w;

    public Human(int t, int w) {
        this.t = t;
        this.w = w;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getTimeRunning() {
        return t * w;
    }

    @Override
    public String toString() {
        return "Human{" +
                "t=" + t +
                ", w=" + w +
                '}';
    }
}
