

public class main {

    public static void main(String args[]){
		A a = new A();
		a.method1();
    }

}


class A {

	void method1() {
		int var1 = 0;
		int variable2 = 5;
		
		B classB = new B();

		int var3 = classB.method2(var1, variable2);
		int var4 = classB.method3(var3, var3);
	}

	int method(int a) {
		return a;

	}


}


class B {

	int method2(int a, int b) {
		int variable2 = a + b;

		A classA = new A();

		variable2 = classA.method(variable2);
		return variable2;
	}

	int method3(int a, int b) {
		int var = a + b;

		A classA = new A();

		var = classA.method(var);
		return var + var;
	}
}
