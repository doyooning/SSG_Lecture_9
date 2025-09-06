package java_basic_02.day13.assignment.prob1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		if (cheatableChicken instanceof Cheatable) {
			cheatableChicken.fly();
		}

		for (int i = 0; i < 3; i++) {
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			System.out.println((i+1)+"시간 후");
			System.out.println("개의 이동거리= "+dog.getDistance());
			System.out.println("닭의 이동거리= "+chicken.getDistance());
			System.out.println("날으는 닭의 이동거리= "+cheatableChicken.getDistance());
		}
	}
}












