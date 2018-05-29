package week1day2homework;

public class ForEachString {


	public static void main(String[] args) {
		//assigning names in string
		String[] roomates = {"Ragav","Santhosh","Ravi","Prasanth","Sakthi","Vel","Vignesh","Alpha","Beta","Unknown"};

		//implementing the for each loop and checking the names and his gender
		for(String name:roomates)
		{
			switch (name)
			{
			case "Ragav":
				System.out.println("Ragav gender is Male");
				break;
			case "Santhosh":
				System.out.println("Santhosh gender is Female");
				break;
			case "Ravi":
				System.out.println("Ravi gender is Male");
				break;
			case "Prasath":
				System.out.println("Prasanth gender is Male");
				break;
			case "Sakthi":
				System.out.println("Sakthi gender is Male");
				break;
			case "Vel":
				System.out.println("Vel gender is Male");
				break;
			case "Vignesh":
				System.out.println("Vignesh gender is Male");
				break;
			case "Alpha":
				System.out.println("Alpha gender is Male");
				break;
			case "Beta":
				System.out.println("Beta gender is Male");
				break;
			case "Unknown":
				System.out.println("Unknown gender is Male");
				break;
			default:
				System.out.println("No One in list");


			}
		}

	}

}
