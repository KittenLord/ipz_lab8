package work8;

/**
 *  A class that describes a Qt textbox
 */
public class QtTextbox extends Textbox {
    
    /**
     *  A method that renders a Qt textbox
     */
    public void render() {
        System.out.println("Qt textbox with contents: \"" + this.value + "\"");
    }

}
