package D;

/* public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
        // by declaring the StandardKeyboard and Monitor with the new keyword, we've tightly coupled these three classes together
        // this is a problem
        // not only does this make our Windows98Computer hard to test, but we've also lost the ability to switch out our 
        // StandardKeyboard class with a different one should the need arise. And we're stuck with our Monitor class too.
    }
}
*/

public class Windows98Machine {

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
