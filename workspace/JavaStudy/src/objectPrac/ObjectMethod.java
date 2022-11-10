package objectPrac;

public class ObjectMethod {

	public static void main(String[] args) {
		// equals
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		valEquals(v1, v2);
		v1 = v2;
		valEquals(v1, v2);

		Cost c1 = new Cost(10);
		Cost c2 = new Cost(10);
		valEquals(c1, c2);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());

		System.out.println(c1.toString());
		Class c1c = c1.getClass();
		System.out.println(c1c.getName());
		c1c = Cost.class;
		System.out.println(c1c.getName());
		
		
	}

	static void valEquals(Object o1, Object o2) {
		if (o1.equals(o2))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
}

class Cost {
	int cost;

	Cost(int cost) {
		this.cost = cost;
	}
}