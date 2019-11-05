import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bakery> list = new ArrayList<>();
        Scanner k = new Scanner(System.in);
        list.add(new Bakery("Croissant", 3.00, "11/10/19", 5, true, true, true, false, false));
        list.add(new Bakery("Muffin", 4.00, "11/11/19", 3, true, false, true, false, false));
        list.add(new Bakery("Banana Bread", 3.50, "11/10/19", 8, false, true, true, false, false));
        list.add(new Bakery("Danish", 2.75, "11/07/19", 1, true, false, false, true, false));
        list.add(new Bakery("Peanut Butter Brownie", 3.00, "11/15/19", 5, false, true, false, false, true));
        list.add(new Bakery("Chocolate Croissant", 3.50, "11/10/19", 4, true, true, false, true, false));
        list.add(new Bakery("Bread Pudding", 2.00, "11/20/19", 12, true, false, true, false, false));
        list.add(new Bakery("Cinnamon Bread", 3.00, "11/14/19", 5, false, false, true, true, true));
        list.add(new Bakery("Scone", 5.00, "11/18/19", 6, true, true, true, false, false));
        list.add(new Bakery("Apple Fritter", 4.00, "11/08/19", 7, false, false, true, true, false));
        list.add(new Bakery("Peanut Butter Cookie", 2.00, "11/30/19", 15, true, false, true, false, true));
        list.add(new Bakery("Crepe", 6.00, "11/08/19", 9, true, true, true, true, false));
        list.add(new Bakery("S'more", 2.25, "11/10/19", 11, true, true, false, true, true));
        list.add(new Bakery("Cream Cheese Danish", 4.00, "11/09/19", 6, false, true, false, true, false));
        list.add(new Bakery("Donut", 1.00, "11/18/19", 20, false, false, false, false, false));
        BakedDB db = new BakedDB(list);

        System.out.println("Welcome to our Bakery! We contain gluten, soy, egg, dairy and peanut in out products.");
        System.out.println("To search for foods that you can eat, please enter your dietary restriction:");
        String diet = k.nextLine();
        db.search(diet);
        System.out.println("Choose an item from the list to see more information");
        String choice = k.nextLine();
        db.display(choice);
    }
}
