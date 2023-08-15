package MyTest;

public class Variable {
int a=200;
static int b=300;

  static int d=440;
	
	public static void main(String[] args) {
		Variable obj=new Variable();
		int c=900;
		
    int e=obj.a+b+c+obj.d;
    System.out.println(e);
	}

}
