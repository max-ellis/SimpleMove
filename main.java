

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
	Helper f = new Helper();
        int x = f.getIntX();
        int y = getIntY();
        graph(x, y);
    }


    private static int getIntY(){
        return 4;
    }

    private static void graph(int a, int b){
        System.out.println(a*b);
    }
}


class Helper {

	public static void Helper(){

	}

    public static int getIntX(){
	return 20;
    }

}
