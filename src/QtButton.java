package work8;

/**
 *  A class that describes a Qt button
 */
public class QtButton implements Button {

    /**
     *  A method that gets triggered on Qt button click
     */
    public void onClick() {
        System.out.println("Qt button click");
    }

    /**
     *  A method that renders a Qt button
     */
    public void render() {
        System.out.println("Qt button render");
    }

}
