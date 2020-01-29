package volodymyr.task.max;

public class Application_test {

	public static void main(String[] args) {
	
		NewArrayList_test<String> arrayList = new NewArrayList_test<String>();
		
		System.out.println(arrayList);
		
		arrayList.add("A");
		arrayList.add("B");
		
		arrayList.add("A");
		arrayList.add("B");
		
		System.out.println(arrayList);
		
		arrayList.remove(1);
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.remove(1);
		
		System.out.println(arrayList);
		
	}

}
