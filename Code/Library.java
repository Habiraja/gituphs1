import java.util.*;
import java.io.*;

class Test{
	class Book{
		public static int index=100;
		int id;
		int copies = 3;
		String name="";
		Book(){
			id=index++;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Book Name");
			name = scan.nextLine();
		}
	}	
	public void showBookDetails(){
		if(bookHash.size() > 0){
			for(Test.Book ins: bookHash.values()){
				System.out.println("Book Name :"+ins.name);
				System.out.println("Book Id :"+ins.id);
				bookIdSet.add(ins.id);
			}
		}
		else{
			System.out.println("No books available");
		}
	}
	public void lendBook(){
		showBookDetails();
		System.out.println("Enter Book Id to Borrow :");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int bookId = Integer.parseInt(input);
		if(bookIdSet.contains(bookId)){
			for(Test.Book ins: bookHash.values()){
				if(ins.id == bookId){
					if(ins.copies >0){
						System.out.println("Enter student Id to Borrow");
						input =scan.nextLine();
						int studId = Integer.parseInt(input);
						studBookHash.put(studId,ins);
						studIdSet.add(studId);
						ins.copies --;
					}
				}
			}
		}
	}

	public void showRemainingQty(){
		if(bookHash.size() > 0){
			for(Test.Book ins: bookHash.values()){
				System.out.println("Book Name :"+ins.name);
				System.out.println("Book Id :"+ins.id);
				bookIdSet.add(ins.id);
				System.out.println("Book Remaining Copies :"+ins.copies);
			}
		}
		else{
			System.out.println("No books available");
		}
	}

	public void returnBook(){
		if(studIdSet.size()>0 ){
			System.out.println("Enter StudId to return Book");
			Scanner scan= new Scanner(System.in);
			String input = scan.nextLine();
			int studId= Integer.parseInt(input);
			if(studIdSet.contains(studId)){
				Test.Book copy =studBookHash.get(studId);
				copy.copies++;
				studBookHash.remove(studId);
				studIdSet.remove(studId);
			}
			else{
				System.out.println("No such student available");
			}
		}
		else{
			System.out.println("No Students available");
		}
	}
	public void addBook(){
		Test.Book book=new Book();
		bookHash.put(bookCnt++,book);
	}
	HashSet<Integer> studIdSet = new HashSet<>();
	HashSet<Integer> bookIdSet = new HashSet<>();
	Test.Book[] bArr=new Test.Book[3];
	HashMap<Integer,Test.Book> bookHash = new HashMap<>();
	HashMap<Integer,Test.Book> studBookHash = new HashMap<>();
	int bookCnt=1;

	public static void main(String[] args){
		Test test = new Test();
		int choice=-1;
		while(choice!=0){
			System.out.println("---------Menu--------");
			System.out.println("1. Show Books");
			System.out.println("2. Lend Book");
			System.out.println("3. Remaining Books");
			System.out.println("4. Add new Book");
			System.out.println("5. Return book");
			System.out.println("6. Exit");
	
			System.out.println("Please enter your choise");
			Scanner scan= new Scanner(System.in);
			String input =scan.nextLine();
			choice = Integer.parseInt(input);
			if(choice>0 && choice <= 6){
				if(choice ==1){
					test.showBookDetails();
				}
				else if(choice ==2){
					test.lendBook();
				}
				else if(choice ==3){
					test.showRemainingQty();
				}
				else if(choice ==4){
					//showBooksRetainedBy();
					test.addBook();
				}
				else if(choice ==5){
					test.returnBook();
				}
				else{
					choice =0;
				}
			}
		}
	}
}