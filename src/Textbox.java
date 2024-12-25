package work8;

/**
 *  An interface that describes a textbox
 */
public abstract class Textbox {

    /**
     *  A field which contains the current value of the textbox
     */
    protected String value;

    /**
     *  A method to set the value of the textbox
     */
    public void setValue(String value) { this.value = value; }

    /**
     *  A method that returns the current value of the textbox
     */
    public String getValue() { return this.value; }

    /**
     *  A an abstract method that renders the textbox
     */
    public abstract void render();

}
