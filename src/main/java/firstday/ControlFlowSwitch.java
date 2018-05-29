package firstday;

public class ControlFlowSwitch {

	public static void main(String[] args) {
		int day=6;

		switch(day)
		{
		case 1:
			System.out.println("1 is represented Monday");
			break;
		case 2:
			System.out.println("2 is represented Tuesday");
			break;
		case 3:
			System.out.println("3 is represented Wednesday");
			break;
		case 4:
			System.out.println("4 is represented Thrusday");
			break;
		case 5:
			System.out.println("5 is represented Friday");
			break;
		case 6:
			System.out.println("6 is represented Saturday");
			break;

		default:
		{System.out.println("Sunday is holiday");}



		}

	}
}