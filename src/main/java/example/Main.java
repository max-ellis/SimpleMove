package example;

public class Main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
	Helper f = new Helper();
        int x = getX();
        int y = f.getY();
        f.graph(x, y);
    }

    public static int getX(){
	return 20;
    }

}


class Helper {

	public static void Helper(){

	}


    public static int getY(){
        return 4;
    }

    public static void graph(int a, int b){
        System.out.println(a*b);
    }
}
