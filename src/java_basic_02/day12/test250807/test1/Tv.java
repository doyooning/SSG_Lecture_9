package java_basic_02.day12.test250807.test1;

public class Tv {
    String color;
    boolean power;
    int channel;

    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void print() {
        System.out.printf("color :%s\t power:%-5b\tchannel:%d\n", color, power, channel);
    }
}
