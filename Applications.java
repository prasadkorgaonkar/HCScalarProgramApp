package Assignments1;

public class Applications {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();

		{
			Menu mainMenu = new Menu(0, "Data Structure");

			Menu stackMenu = new Menu(1, "Stack");

			Menu queueMenu = new Menu(2, "Queue");

			Menu arrayMenu = new Menu(3, "Array");

			Menu linkedListMenu = new Menu(4, "LinkedList");

			mainMenu.addMenuItem(stackMenu);
			mainMenu.addMenuItem(queueMenu);
			mainMenu.addMenuItem(arrayMenu);
			mainMenu.addMenuItem(linkedListMenu);

			stackMenu.addMenuItem(new MenuItem(1, "Push"));
			stackMenu.addMenuItem(new MenuItem(2, "Pop"));
			stackMenu.addMenuItem(new MenuItem(3, "Peek"));
			stackMenu.addMenuItem(new MenuItem(4, "Show"));

			queueMenu.addMenuItem(new MenuItem(1, "enQueue"));
			queueMenu.addMenuItem(new MenuItem(2, "deQueue"));
			queueMenu.addMenuItem(new MenuItem(3, "Size of the Queue"));
			queueMenu.addMenuItem(new MenuItem(4, "Display Queue"));

			arrayMenu.addMenuItem(new MenuItem(1, "Insert At Start"));
			arrayMenu.addMenuItem(new MenuItem(2, "Delete"));
			arrayMenu.addMenuItem(new MenuItem(3, "Size of the Array"));
			arrayMenu.addMenuItem(new MenuItem(4, "Display Array"));

			linkedListMenu.addMenuItem(new MenuItem(1, "Insert At Head"));
//			linkedListMenu.addMenuItem(new MenuItem(2, "Insert At Tail"));
			linkedListMenu.addMenuItem(new MenuItem(3, "Delete"));
			linkedListMenu.addMenuItem(new MenuItem(4, "Display LinkedList"));

			mainMenu.display();

		}
	}
}
