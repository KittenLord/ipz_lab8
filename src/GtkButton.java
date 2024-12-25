package work8;

/**
 *  A class that describes a Gtk button
 */
public class GtkButton implements Button {

    /**
     *  A method that gets triggered on click
     */
    public void onClick() {
        System.out.println("Gtk button click");
    }

    /**
     *  A method that renders a Gtk button
     */
    public void render() {
        System.out.println("Gtk button render");
    }

}
