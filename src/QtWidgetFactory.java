package work8;

/**
 *  A widget factory which creates widgets for the Qt platform
 */
public class QtWidgetFactory implements WidgetFactory {

    /**
     *  A method that creates a new Qt button
     */
    public Button createButton() { return new QtButton(); }

    /**
     *  A method that creates a new Qt textbox
     */
    public Textbox createTextbox() { return new QtTextbox(); }

}
