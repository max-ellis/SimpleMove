

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
	Helper f = new Helper();
        int x = f.getX();
        int y = f.getY();
        f.graph(x, y);
    }



}


class Helper {

	public static void Helper(){

	}

    public static int getX(){
	return 20;
    }

    public static int getY(){
        return 4;
    }

    public static void graph(int a, int b){
        System.out.println(a*b);
    }

}
