package work8;

import java.util.Scanner;

/**
 *  A class that contains the entry point for the program
 */
public class Main {

    /**
     *  The entry point of the program
     */
    public static void main(String[] args) {

        PlatformType platform = PlatformType.Win;
        WidgetFactoryFactory wff = new WidgetFactoryFactory();
        WidgetFactory factory = wff.create(platform);

        Textbox usernameTextbox = factory.createTextbox();
        Textbox passwordTextbox = factory.createTextbox();
        Button submitButton = factory.createButton();

        usernameTextbox.render();
        passwordTextbox.render();
        submitButton.render();
    
        Scanner s = new Scanner(System.in);

        System.out.println("Insert username: ");
        String username = s.next();
        usernameTextbox.setValue(username);
        usernameTextbox.render();

        System.out.println("Insert password: ");
        String password = s.next();
        passwordTextbox.setValue(password);
        passwordTextbox.render();

        System.out.println("Submitting...");
        // String __ = s.next(); // this doesn't trigger at empty line
        submitButton.onClick();

        usernameTextbox.render();
        passwordTextbox.render();
        submitButton.render();
    }

}
