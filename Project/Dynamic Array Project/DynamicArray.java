import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        DemoArray objDemoArray = new DemoArray();
        Scanner scan = new Scanner(System.in);
        int val, pos;
        while(true){
            System.out.println();
            System.out.println(" ------- List Menu -------");
            System.out.println("1. Insert at begining");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at index");
            System.out.println("4. Delete at begining");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at index");
            System.out.println("7. Display the list");
            System.out.println("8. Give me the size of Array");
            System.out.println("9. Get Index");
            System.out.println("10. Get value");
            System.out.println("11. All clear");
            System.out.println("12. Contains");
            System.out.println("13. Exit");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number ");
                    val = scan.nextInt();
                    objDemoArray.insertAtBegining(val);
                    break;
                case 2:
                    System.out.println("Enter the number");
                    val = scan.nextInt();
                    objDemoArray.insertAtEnd(val);
                break;
                case 3:
                    System.out.println("Enter the number");
                    val = scan.nextInt();
                    System.out.println("Enter the position");
                    pos = scan.nextInt();
                    objDemoArray.insertAtPosition(val, pos);
                    break;
                case 4:
                    objDemoArray.deleteAtBegining();
                    break;
                case 5:
                    objDemoArray.deleteAtEnd();
                    break;
                case 6:
                    System.out.println("Enter the deleting position");
                    pos = scan.nextInt();
                    objDemoArray.deleteAtPosition(pos);
                    break;
                case 7:
                    objDemoArray.display();
                    break;
                case 8:
                    objDemoArray.length();
                    break;
                case 9:
                    System.out.println("Enter the number");
                    val = scan.nextInt();
                    objDemoArray.getIndex(val);
                    break;
                case 10:
                    System.out.println("Enter the index");
                    pos = scan.nextInt();
                    objDemoArray.searchTheValue(pos);
                    break;
                case 11:
                    objDemoArray.allClear();
                    break;
                case 12:
                    System.out.println("Enter the number");
                    val = scan.nextInt();
                    objDemoArray.contains(val);
                    break;
                case 13:
                    System.exit(0);
        
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
