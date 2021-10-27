package D;

// public class StandardKeyboard {

// }

/*
Now our classes are decoupled and communicate through the Keyboard abstraction. 
If we want, we can easily switch out the type of keyboard in our machine with a
different implementation of the interface. We can follow the same principle for the Monitor class.
*/

public class StandardKeyboard implements Keyboard { }
