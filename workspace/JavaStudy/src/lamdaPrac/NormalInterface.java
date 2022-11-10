package lamdaPrac;

@FunctionalInterface
public interface NormalInterface {
	void normalMethod();
}

interface NormalInterface1 { // in x out x
	void normalMethod1();
}

interface NormalInterface2 { // in x out o
	int normalMethod2();
}

interface NormalInterface3 { // in o out x
	void normalMethod3(int i);
}

interface NormalInterface4 { // in o out o
	double normalMethod4(int i, double d);
}
