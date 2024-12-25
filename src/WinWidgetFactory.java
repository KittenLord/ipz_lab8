package work8;

/**
 *  A widget factory that creates widgets for the Win platform
 */
public class WinWidgetFactory implements WidgetFactory {
    
    /**
     *  A method that creates a Win button
     */
    public Button createButton() { return new WinButton(); }

    /**
     *  A method that creates a Win textbox
     */
    public Textbox createTextbox() { return new WinTextbox(); }

}
