package LearnLinkedLists;

import java.util.Scanner;

public class MainLinkedlistLocation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the node data to be inserted:a");
		int a = sc.nextInt();
		System.out.println("Enter the node data to be inserted:b");
		int b = sc.nextInt();
		System.out.println("Enter the node data to be inserted:c");
		int c = sc.nextInt();
		Linkedlist_Node_Insertion list = new Linkedlist_Node_Insertion();
		System.out.println(a);
		list.insert(a);
		list.insert(b);
		list.insert(c);
		list.show();
	}

}
