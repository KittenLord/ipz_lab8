package work8;
// I can't believe that I unironically have to do this

/**
 *  A factory that creates a widget factory depending on the platform
 */
public class WidgetFactoryFactory {

    /**
     *  A method that creates a new widget factory
     */
    public WidgetFactory create(PlatformType platform) {
        if(platform == PlatformType.Win) return new WinWidgetFactory();
        if(platform == PlatformType.Gtk) return new GtkWidgetFactory();
        if(platform == PlatformType.Qt) return new QtWidgetFactory();
        return null;
    }

}
