package collectionFramework;

class GenBox<T> {
	private T t;

	public T getbox() {
		return t;
	}

	public void setBox(T t) {
		this.t = t;
	}

}

class Gen2Box<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class BoxRun2 {

	public static void main(String[] args) {
		GenBox<Integer> b1 = new GenBox<>();
		b1.setBox(12);
		System.out.println(b1.getbox());
		GenBox<String> b2 = new GenBox<>();
		b2.setBox("제너릭박스");
		System.out.println(b2.getbox());

		Gen2Box<String, Integer> b21 = new Gen2Box<>();
		b21.setKey("java");
		b21.setValue(1234);
		System.out.println(b21.getKey() + " " + b21.getValue());

		Gen2Box<Integer, String> b22 = new Gen2Box<>();
		b22.setKey(7);
		b22.setValue("제임스 본드");
		System.out.printf("%03d %s \n",b22.getKey(),b22.getValue());
		
		Gen2Box<String, Void> b23 = new Gen2Box<>();
		b23.setKey("key만 사용");
		System.out.printf("%s \n",b23.getKey());
		
	}

}
