package example;

public class Main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
	Helper f = new Helper();
        int x = f.getY();
        int y = f.getSecondNumber();
        f.graph(x, y);
    }


}


class Helper {

	public static void Helper(){

	}

    public static int getY(){
	return 20;
    }

    public static int getSecondNumber(){
        return 4;
    }

    public static void graph(int a, int b){
        System.out.println(a*b);
    }
}
