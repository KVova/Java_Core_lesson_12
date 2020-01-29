package volodymyr.task.max;

public class Apprication {

	public static void main(String[] args) {
		
		InterfaceArray<String> array = new ApplicationArray<>();
		array.add("first");
		array.add("second");
		System.out.println(array.get(0));
		System.out.println(array.get(1));

		array.remove(1);
		
		System.out.println(array.get(0));

	}

}
