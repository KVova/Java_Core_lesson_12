package volodymyr.task.max;

public interface InterfaceArray<E> extends Iterable<E> {

	boolean add(E e);
	void remove(int index);
	E get(int index);
	
}
