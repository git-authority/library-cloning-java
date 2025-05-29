package src;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Create Library
        Library library = new Library("Central_Library");

        // Add books
        library.addBook(new Book("Frankestein", "Mary_Shelley"));
        library.addBook(new Book("King_Arthur_and_the_Round_Table", "Rosemary_Sutcliff"));

        // Display original
        System.out.println("Original Library : ");
        library.display();

        // Clone
        Library shallowLibrary = library.shallowClone();
        Library deepLibrary = library.deepClone();

        // Modify original
        library.books.get(1).title = "Treasure_Island";
        library.books.get(1).author = "Robert_Louis_Stevenson";

        // Display after modification
        System.out.println("\nAfter Modifications :\n");

        System.out.println("Original Library : ");
        library.display();

        System.out.println("\nShallow Clone : ");
        shallowLibrary.display();

        System.out.println("\nDeep Clone : ");
        deepLibrary.display();
    }
}
