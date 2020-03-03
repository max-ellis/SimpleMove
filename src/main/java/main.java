

public class main {

    public static void main(String args[]){
		ClassA a = new ClassA();
		ClasB b = new ClasB();
		a.testMethod1();
		b.add();
		int x = 2;
    }

}


class ClassA {

	void testMethod1() {
		int variableOne = 1;
		int variableTwo = 2;

		int somethingElse = variableOne * variableTwo;
		int that = somethingElse;
		int does = that * somethingElse;
		int code = does;

	}

}

class ClasB {

	void add() {
		int variable1 = 1;
		int variable2 = 2;

		int something = variable1;
		int that = variable2;
		int does = 0;
		int code = that + does + something;

	}

}
