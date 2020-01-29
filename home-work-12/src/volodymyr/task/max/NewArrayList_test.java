package volodymyr.task.max;

public class NewArrayList_test<T> {

	private final int INIT_SIZE = 5;
	private final int CUT_RATE = 2;
	private Object[] newArray = new Object[INIT_SIZE];
	private int pointer = 0;

	/*
	 * Додає новий елемент в список. При досягненні розміру внутрішнього масиву
	 * відбувається його збільшення в два рази.
	 */
	public void add(T item) {
		if (pointer == newArray.length - 1)
			resize(newArray.length * 2); // збільшує в 2 рази, якщо досяг кінця
		newArray[pointer++] = item;
	}

	/*
	 * Повертає елемент списку за індексом.
	 */
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) newArray[index];
	}

	/*
	 * Видаляє елемент списку за індексом. Всі елементи праворуч від видалноого
	 * переміщаються на крок ліворуч. Якщо після видалення елемента кількість
	 * елементів стала в CUT_RATE раз менше, ніж розмір внутрішнього масиву, то
	 * внутрішній масив зменшується в два рази, для економії займаного місця.
	 */
	public void remove(int index) {
		for (int i = index; i < pointer; i++)
			newArray[i] = newArray[i + 1];
		newArray[pointer] = null;
		pointer--;
		if (newArray.length > INIT_SIZE && pointer < newArray.length / CUT_RATE)
			resize(newArray.length / 2); // якщо елементів в CUT_RATE раз менше ніж
									// довжина масиву, то зменшується в два рази
	}

	/* Повертає кількість елементів у списку */
	public int size() {
		return pointer;
	}

	/* Допоміжний метод для масштабування. */
	private void resize(int newLength) {
		Object[] newArrayList = new Object[newLength];
		System.arraycopy(newArray, 0, newArrayList, 0, pointer);
		newArray = newArrayList;
	}
}
