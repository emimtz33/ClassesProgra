public class JavaMethods {
    

    //A method is a block of code that only runs when we call it from withing the main class
    //We use methods to re use code many times



    //CREATING A METHOD

    //To create a method we need to first be inside a class (in this case is the JavaMethods class)
    //For our case we will call the static class since this method will only be available through this class. If it were to change we substitute the static class with the public one
    //Since this method doesn't return a value we call the void class
    //If this method were to return us a number, by doing a calculation for example, we specify what data will it return (int, double...) instead of using void
    //Next we name our class (following convection) followed by parenthesis " () "

    static void myMethod () {
        //Here we write our code
    }



    //NAMING METHODS

    //In java a method should follow these rules to comply with the convection

    //1. Method names must start with a verb in lower case
    //2. Multi-word names should follow camelCase format
    //3. Method names must be unice within a class (with some exemptions)



    //CALLING A METHOD

    //To call a method, write the name followed by parenthesis.
    //You need to call the method withing the main class

    //Here we will have a method that writes some text and call it 5 times

    static void writeText () {
        System.out.println("Hello, world");
    }


    public static void main(String[] args) {
        
        writeText();
        writeText();
        writeText();
        writeText();
        writeText();

    }


    //We can see how instead of writing the whole function, we just call the method for it.
    
    //Now imagine if we have a function that is longer and needs to be called repetedly, that is were methods really shine

    
    //Here is another example of a longer method that can be used

    static void longerMethod () {

        System.out.println("Starting the method");

        int x = 2;
        int y = 10;

        while (x < y) {
            
            System.out.println("x is bigger than y");
            x++; //We increment x by one
        }

        System.out.println("The value for x is: " + x);
        System.out.println("The value for y is: " + y);

    }

    //You can start to see why we use methods for complex applications




    //METHOD PARAMETERS AND ARGUMENTS

    //Parameters act as variables inside a method
    //We write them inside the parenthesis on the method name

    static void nameMethod (String name1, String name2) {
        System.out.println(name1 + ": name 1");
        System.out.println(name2 + ": name 2");
    }

    //We call the method inside the main class and inside we write the argument we want to pass to int

    // nameMethod("John", "Joe");


    //You can have as many parameters as you want

    static void characterMethod (String name, int age){
        System.out.println(name + "is: " + age);
    }

    // characterMethod("John" , 21);
    // characterMethod("Joe" , 28);




    //METHOD WITH IF ELSE

    //We can also use other statements inside methods
    //Here we will use the if else statement

    static void checkCash(int cash) {

        //If we have enough cash then the system will let us know

        if (cash > 10) {
            System.out.println("You have enough cash to buy this");
        } else {
            System.out.println("You don't have enough cash");
        }

    }

    //We can write our method inside the main class like some

    // checkCash(20); //System output : ("You have enough cash to buy this")
    // checkCash(5); //System output : ("You don't have enough cash")

    
    
    //RETURN METHOD

    //The opposite of void is return
    //We use the return keyword when we want our method to return us a value (it also finishes the method)
    //Here we are going to use a

    public static int returnNumber (int number) {
        return(number + 1);
    }

    //This will return is our number plus 1
    //So if we where to call the method and assign it the number 5 it will return 6



    //Here are the resources for simple Java Methods
    //https://www.w3schools.com/java/java_methods.asp
    //https://www.geeksforgeeks.org/java/methods-in-java/

    //Here are some for Java return
    //https://www.datacamp.com/doc/java/return

}
