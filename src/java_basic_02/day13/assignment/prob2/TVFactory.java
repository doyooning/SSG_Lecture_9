package java_basic_02.day13.assignment.prob2;

public class TVFactory extends Factory implements IWorkingTogether {

    public TVFactory(String name, int openHour, int closeHour) {
        super(name, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {

        switch (skill) {
            case 'A' -> {
                return 8 * getWorkingTime();
            }
            case 'B' -> {
                return 5 * getWorkingTime();
            }
            case 'C' -> {
                return 3 * getWorkingTime();
            }
            default -> {
                return getWorkingTime();
            }
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory)partner).makeProducts('C');
    }
}
