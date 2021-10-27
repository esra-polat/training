package S;
public class Book {

    private String name;
    private String author;
    private String text;

    //constructor, getters and setters

    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    /*
    
    To fix our mess, we should implement a separate class that deals only with printing our texts:

    void printTextToConsole(){
        // our code for formatting and printing the text
    }
    
    */
}

