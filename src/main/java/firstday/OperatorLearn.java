package firstday;

public class OperatorLearn {

	public static void main(String[] args) {
		int x = 4;
		x++;
		int y = 3;
		++y;
		int a=x+y;
		System.out.println("The addition of x and y is "+a);
		int b=x-y;
		System.out.println("The remainder value x-y is "+b);

		int u=4;
		int v=3;
		u--;
		--v;
		int c=u+v;
		System.out.println("The addition of u and v is "+c);
		int d=u-v;
		System.out.println("The remainder value u-v is "+d);

		if (x==y && x<=y)
		{
			System.out.println("The x is equal too y and x is not less than or equal to y");
		}
		else
		{
			System.out.println("The x is not equal too y but x is greater than y");
		}

	}

}
