import java.util.Scanner;
class ArrayDemoClass{
	public static void main(String [] args){
		DynamicArray list = new DynamicArray();
		Scanner scan = new Scanner(System.in);
		while(true){
			int value;
			int position;
			System.out.print("\n1.Insert at End\n" + "2.Display the list\n" + "3.Insert at specified position\n" + "4.Delete from specified position\n"+ "5.Exit\n");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice){
			case 1: System.out.println("Enter the data");
				value = scan.nextInt();
				list.add(value);
				break;
			case 2: list.display();
				break;
				
			case 3: System.out.println("Enter the position");
				position = scan.nextInt();
				System.out.println("Enter the Data");
				value = scan.nextInt();
				list.insertAtPos(position, value);
				break;
			case 4: System.out.println("Enter the position");
				position = scan.nextInt();
				if(position<0){
					System.out.println("Invalid position");
					break;
				}
				list.deleteAtPos(position);
				break;
			case 5: System.exit(0);
			
			default: System.out.println("Invalid choice");
			}
		}
	}
}