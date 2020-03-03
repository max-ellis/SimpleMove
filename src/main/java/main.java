

public class main {

    public static void main(String args[]){
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		b.testMethod1();
		ClassC c = new ClassC();
		b.add();
		c.testMethod2();
    }

}


class ClassA {


}

class ClassB {

	void add() {
		int variable1 = 1;
		int variable2 = 2;

		int something = variable1;
		int that = variable2;
		int does = 0;
		int code = that + does + something;

	}

	void testMethod1() {
		int variableOne = 1;
		int variableTwo = 2;

		int somethingElse = variableOne * variableTwo;
		int that = somethingElse;
		int does = that * somethingElse;
		int code = does;

	}
}


class ClassC {

	void testMethod2() {
		int variableOne = 1;
		int variableTwo = 2;

		int somethingElse = variableOne * variableTwo;
		int that = somethingElse;
		int does = that * somethingElse;

	}

}
