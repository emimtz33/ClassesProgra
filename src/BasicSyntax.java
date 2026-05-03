public class BasicSyntax {

    //All commands must end in " ; "

    //  CREATING VARIABLES AND NAMING THEM

    //Instance Variables (Non Static Fields)
    //Variables who are independent to each object and are used to store numbers of data in them

    int currentSpeed; //Each current speed is different to each object (bycicle)


    //Class Variables (Static Fields)
    //There is only one type of this variable in existence and it will not change between objects
    //This variables are not able to be called within a parameter only within a class

    static int numberOfGears = 6; //All objects (bycicles) will have the same number of gears


    //Local Variables
    //Used to storing temporary state, they are only accessed through the method they are instanciated, not the whole class (class = text file)

    int count = 2; //We will only access this number through this method and it may change


    //This is called a parameter
    public static void parameter(String[] args) {
        
        
    }


    //  NAMING CONVENCTIONS FOR VARIABLES

    //You can start your variable with any legal identifier

    int $variable;
    int _variable;


    //But the convention states thay you need to start your variables with a letter
    //We shouldn't use the dollar sign in any variable and the underscore is discouraged. Similarly having white space is totally forbidden

    //int vari able;  (WRONG)
    int variable;   //(Good naming)


    //As part of common practices, you should never abbreviate your variable names, as this will hinder your speed in reading code

    int s; //(Not good)
    int bycicleSpeed; //(Good naming, specific and direct)


    //If your variable name consists of only one word then all of it should be in lower case
    
    int apples;
    int oranges;

    //if it consists of more than two words, capitalize the first letter of each subsequent word (this is called camelCase)

    int gearRatio;
    int currentGear;


    //If your variable stores a constant value such as: static final. Every letter is capitalized and subsequent words are separated by underscore

    final static int NUM_GEARS = 6;


    //Java has a set of keywords that are reserved words that cannot be used as any identifier
    //https://www.w3schools.com/java/java_ref_keywords.asp


    // PRINTING OUTPUT

    //To print outputs we use the "println" method to output values in java to the visual studio terminal
    //To call this method we first need to convey the system "system" then dot " . " to enter the system functions "system." to output any value we use the "out" method "Systen.out." and then we can call the print line method "System.out.println"
    //Inside this method we will add parenthesis "System.out.println()" to add the value we want to print. It could be variables or strings
    //(Note: to call this method we need to be withing a parameter in order to write on the terminal
    
    public static void main(String[] args) {
        System.out.println(12);
        System.out.println("Hello, world");
    }


    //For more info on Java Syntax check:
    //https://dev.java/learn/language-basics/

}
