package work8;

/**
 *  A class that describes a Win textbox
 */
public class WinTextbox extends Textbox {
    
    /**
     *  A method that renders a Win textbox
     */
    public void render() {
        System.out.println("Win textbox with contents: \"" + this.value + "\"");
    }

}
