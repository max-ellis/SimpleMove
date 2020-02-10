package example;

public class Main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
	Helper f = new Helper();
        int x = getFirstNum();
        int y = f.getSecondNumber();
        print(x, y);
    }

    public static void print(int a, int b){
        System.out.println(a*b);
    }

    public static int getFirstNum(){
	Helper f = new Helper();
	return f.getSecondNumber()*5;
    }

}


class Helper {

	public static void Helper(){

	}

    public static int getSecondNumber(){
        return 4;
    }

}
