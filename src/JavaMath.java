public class JavaMath {
    

    //ARITHMETRIC OPERATORS

    //Multiplicative
    // " * "

    //Additive
    // " + , -  "

    //Division
    // " / "

    int multiplication = 23  * 23;
    int addition = 4  + 4;
    int substraction = 10 - 4;
    int division = 60 / 6;



    //EQUALITY AND RELATIONAL OPERATORS

    //Equal to
    // " == "
    
    //Not equal to
    // " != "

    //Greater than / Greater than or equal to
    // > / >=

    //Less than / Less than or equal to
    // < / <=


    public static void equalityOperators() {
        System.out.println(23 >= 10); //Output is equal to true
        System.out.println(12 >= 30); //Output is equal to false

        System.out.println(100 == 10); //Output is equal to false
        System.out.println(100 != 29); //Output is equal to true
    }



    //CONDITIONAL OPERATORS

    //Conditional-AND
    //Both need to be true
    // " && "

    //Conditional-OR
    //Just one needs to be true
    // " || "
    
    public static void conditionalOperators() {
        boolean x = true;
        boolean y = false;

        if ((x == true) && (y == false)) {  //Both expressions are true
            System.out.println("x is equal to true and y is equal to false");
        }
        
        if ((x == true) || (y == true)) {  //Just one expression is true
            System.out.println("x is equal to true or y is equal to true");
        }
    }



    //For more info on java math check out this resource:
    //https://dev.java/learn/language-basics/using-operators/

    //Cheat Sheet for operators
    //https://dev.java/learn/language-basics/all-operators/



    //Main class to run all methods in the terminal
    public static void main(String[] args) {
        equalityOperators();
        conditionalOperators();
    }

}
