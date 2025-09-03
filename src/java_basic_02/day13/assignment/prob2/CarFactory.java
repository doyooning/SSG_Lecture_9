package java_basic_02.day13.assignment.prob2;

public class CarFactory extends Factory implements IWorkingTogether {
    public CarFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        switch (skill) {
            case 'A' -> {
                return 3 * getWorkingTime();
            }
            case 'B' -> {
                return 2 * getWorkingTime();
            }
            case 'C' -> {
                return getWorkingTime();
            }
            default -> {
                return 0;
            }
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((CarFactory)partner).makeProducts('B');
    }
}
