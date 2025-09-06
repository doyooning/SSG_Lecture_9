package java_basic_02.day13.Ex01;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void search(String url) {
        System.out.println(url + " Search");
    }

    @Override
    public void turnOn() {
        System.out.println("TV On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV On");
    }
}
