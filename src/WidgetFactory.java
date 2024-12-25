package work8;

/**
 *  An interface that describes a widget factory that creates platform specific widgets
 */
public interface WidgetFactory {

    /**
     *  A method that creates a new button
     */
    public Button createButton();

    /**
     *  A method that creates a new textbox
     */
    public Textbox createTextbox();

}
