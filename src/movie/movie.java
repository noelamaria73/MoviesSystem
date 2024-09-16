package movie;

import java.util.ArrayList;
import java.util.List;

public class movie {
    // Private list of movieItem objects
    private List<movieItem> movieItems;

    // Public constructor to initialize the list
    public movie() {
        movieItems = new ArrayList<>();
    }

    // Public method to add a movieItem to the list
    public void addmovieItem(movieItem item) {
        movieItems.add(item);
    }

    // Public method to print details of all movie items
    public void printmovieDetails() {
        for (movieItem item : movieItems) {
            item.printDetails();  // Call the printDetails method of movieItem
        }
    }
}
