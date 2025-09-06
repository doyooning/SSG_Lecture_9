package java_basic_02.day13.assignment.prob2;

public abstract class Factory {
    private String name;
    private int openHour; // 공장가동시각 h
    private int closeHour; // 공장종료시각 h

    public Factory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return name;
    }

    int getWorkingTime() {
        return closeHour - openHour;
    }

    abstract int makeProducts(char skill);
}
