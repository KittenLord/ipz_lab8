package work8;

/**
 *  A widget factory for the Gtk platform
 */
public class GtkWidgetFactory implements WidgetFactory {

    /**
     *  A method that returns a new Gtk button
     */
    public Button createButton() { return new GtkButton(); }

    /**
     *  A method that returns a new Gtk textbox
     */
    public Textbox createTextbox() { return new GtkTextbox(); }

}
