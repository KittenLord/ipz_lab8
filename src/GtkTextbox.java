package work8;

/**
 *  A class that describes a Gtk textbox
 */
public class GtkTextbox extends Textbox {
    
    /**
     *  A method that renders a Gtk textbox
     */
    public void render() {
        System.out.println("Gtk textbox with contents: \"" + this.value + "\"");
    }

}
