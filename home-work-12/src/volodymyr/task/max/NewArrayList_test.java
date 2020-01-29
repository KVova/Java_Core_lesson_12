package volodymyr.task.max;

public class NewArrayList_test<T> {

	private final int INIT_SIZE = 5;
	private final int CUT_RATE = 2;
	private Object[] newArray = new Object[INIT_SIZE];
	private int pointer = 0;

	/*
	 * ���� ����� ������� � ������. ��� ��������� ������ ����������� ������
	 * ���������� ���� ��������� � ��� ����.
	 */
	public void add(T item) {
		if (pointer == newArray.length - 1)
			resize(newArray.length * 2); // ������ � 2 ����, ���� ����� ����
		newArray[pointer++] = item;
	}

	/*
	 * ������� ������� ������ �� ��������.
	 */
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) newArray[index];
	}

	/*
	 * ������� ������� ������ �� ��������. �� �������� �������� �� ����������
	 * ������������ �� ���� ������. ���� ���� ��������� �������� �������
	 * �������� ����� � CUT_RATE ��� �����, �� ����� ����������� ������, ��
	 * �������� ����� ���������� � ��� ����, ��� �����쳿 ��������� ����.
	 */
	public void remove(int index) {
		for (int i = index; i < pointer; i++)
			newArray[i] = newArray[i + 1];
		newArray[pointer] = null;
		pointer--;
		if (newArray.length > INIT_SIZE && pointer < newArray.length / CUT_RATE)
			resize(newArray.length / 2); // ���� �������� � CUT_RATE ��� ����� ��
									// ������� ������, �� ���������� � ��� ����
	}

	/* ������� ������� �������� � ������ */
	public int size() {
		return pointer;
	}

	/* ��������� ����� ��� �������������. */
	private void resize(int newLength) {
		Object[] newArrayList = new Object[newLength];
		System.arraycopy(newArray, 0, newArrayList, 0, pointer);
		newArray = newArrayList;
	}
}
