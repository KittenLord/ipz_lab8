package work8;

/**
 *  A class that describes a Win button
 */
public class WinButton implements Button {

    /**
     *  A method that gets triggered on Win button click
     */
    public void onClick() { System.out.println("Win button click"); }

    /**
     *  A method that renders a Win button
     */
    public void render() { System.out.println("Win button render"); }

}
