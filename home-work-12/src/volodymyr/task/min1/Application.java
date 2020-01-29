package volodymyr.task.min1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.Box.Filler;

public class Application {

	static void menu() {
		System.out.println();
		System.out.println("Input a, and see random array");
		System.out.println("Input b, and see identical element in array");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> helmMaterialArray = new ArrayList();

		helmMaterialArray.add("Leather");
		helmMaterialArray.add("Alcantara");

		ArrayList<Auto> autoArray = new ArrayList();

		for (int i = 0; i < getRandomValueFromRange(0, 5); i++) {
			autoArray.add(new Auto(getRandomValueFromRange(150, 300), getRandomValueFromRange(1990, 2020),
					new Helm(getRandomValueFromRange(35, 50), helmMaterialArray.get(getRandomValueFromRange(0, 1))),
					new Engine(getRandomValueFromRange(5, 20))));
		}	
		
		while (true) {
			menu();
			switch (sc.nextLine()) {

			case "a": {
				System.out.println(autoArray);
			}
				break;
			case "b": {
				listFill(autoArray);
				System.out.println(autoArray);
//				for (int i = 0; i <autoArray.size(); i++) {
//					autoArray.set(i, new Auto(10, 100, new Helm(3, null), null));
//					System.out.println(autoArray);
//				}	
//				
			}
				break;

			default: {
				System.out.println("Input date must be a or b");

				break;
			}
			}
		}
	}
	
	static ArrayList listFill(ArrayList autoArray) {
		Auto auto = new Auto(getRandomValueFromRange(50, 300), getRandomValueFromRange(1990, 2020), 
					  new Helm(getRandomValueFromRange(1, 5), null),
						new Engine(getRandomValueFromRange(2, 16)));
		for(int i = 0; i<autoArray.size(); i++) {
			autoArray.set(i, auto);
		}
		return autoArray;
	}
	
	static int getRandomValueFromRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}
}
