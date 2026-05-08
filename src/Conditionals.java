public class Conditionals {
    
    //We will be covering most types of conditionals here (if, else, else if, switch)



    //TYPES OF CONDITIONAL STATEMENTS

    //Java has the following conditional statements:

    // if = execute a block of code if a condition is true
    // else = execute a block of code if the same condition is false
    // else if = try a new condition if the first one is false
    // switch = execute many alternate blocks of code (we don't usually use this one) 



    //IF

    //Conditions in if are statements that let you control which code is executed and which is skipped (If pedalling: move bycicle. Otherwise: do nothing)
    //All if statements need a conditions that results in a boolean

    // if (condition) {
    //    block of code to execute if condition is true
    // }

    //It can be used with boolean values or a boolean expression (x < y)

    public void movingBycicle () {

        boolean isPedalling = true;
        byte x = 5;
        byte y = 3;
        byte a = 10;
        byte b = 10;


        if (isPedalling) {
            System.out.println("You are moving");
        }

        if (20 > 10) {
            System.out.println("20 is greater than 10");
        }

        if (x > y) {
            System.out.println("X is greater than Y");
        }

        if (a == b) {
            System.out.println("A is equal to B");
        }

    }

    //If none of the conditions are met then the rest of the code is read



    //ELSE

    //The else statement lets you run code when all conditions are false

    /* 
    if (condition) {
        //Code that runs when it's true
    } else {
        //Code that runs when it's false
    }
    */

    public void pedallingBycicle () {

        boolean isPedalling = true;
        byte speedLimit = 50;
        byte speed = 30;

        if (isPedalling) {
            System.out.println("You are moving");
        } else {
            System.out.println("You are not moving");
        }

        if (speed >= speedLimit) {
            System.out.println("You are going over the speed limit");
        } else {
            System.out.println("You are going under the speed limit");
        }

        //Because the first condition is false the output will be the second line

    }



    //ELSE IF

    //As we mentioned, we use the else if statement when we want to state a new condition if the first one was false
    //Think of it as another option that we can use before we use the else
    //All else if statements need to be after an if and before an else (if it's used)

    public void testingConditions () {

        boolean day = false;
        boolean evening = true;
        boolean night = false;

        if (day) {
            System.out.println("It is currently day time");
        } else if (evening) {
            System.out.println("It is currently in the evening");
        } else if (night) {
            System.out.println("It is already night");
        } else {
            System.out.println("It is neither day, nor evening, nor night");
        }

    }

    //We test all if conditions before going to the final else
    //It is easy to write a nest of if else conditions, but we try to avoid using that method as it is not a good practice



    //TERNARY OPERATOR (SHORT IF ELSE)
    
    //We also have a short way of writing this if else conditions
    //It makes code way more compact but also more difficult to read and understand
    //For this example we will only use the if else stament and not the else if one since it makes unreable code

    //This is the structure: varible = (condition) ? valueIfTrue : valueIfFalse

    //Here we are defining the value for a variable that's why it needs one at the start
    //Next we write the condition that we want in parenthesis (boolean value / boolean expression)
    //Then see the question mark as the if statement, if that condition is true then the value next to the question mark will be used
    //If the condition is false we skip to the value after the colon.

    //We will see it using an example toogling a "slow mode" for a robot

    public void changingSpeed () {
        boolean slowMode = false;

        int currentSpeed = (slowMode) ? 20 : 50;

        System.out.println("The robot's current speed is: " + currentSpeed);
    }

    //In this example we are asking if slow Mode is active, and if that condition is true then change the current Speed of the robot to 20
    //If the condition was false then the speed would be left at 50
    //It is just up to you to tweak that condition and play with it (like having a button that changes if you are going slow or fast)

    

    //SWITCH

    //Now what if you want to use many if else statments but don't want the difficulties that come with it
    //That is what the switch statent is for
    //Think of it like choosing a color for a bycicle
    //If you choose 1 you get red, if you choose 2 you get blue, and so forth and so on
    //The switch statent selects one of many blocks of code to be executed
    //It only needs one set of brackets instead of many like the else if

    //Here is the syntax:
    //switch (expression) {
    //  case x: 
    //      code block
    //      break;
    //  case y:
    //      code block
    //      break;
    //  default:
    //      code block
    //}

    //The switch expression is evaluated once
    //Then we compare each case value and if it's a match we run the code
    //The break statent "ends" the switch after the case runs
    //The default is kind of our else, it runs when no other case matches.

    //The easiest example to see this is with the week

    public void checkingDays () {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is thursday");
                break;
            case 5:
                System.out.println("Today is friday");
                break;
            default:
                System.out.println("Today is the weekend");
        }

    }

    //Here we check for every value at once and run the code for the one that matches
    //We can change the variable that we are checking and the value of it
    //If not one of this cases matches then it will throw out the default code to run

    //We need to have a break statement to indicate the code that it can stop looking for matches (to break out of the switch)
    //The default statement doesn't neccesarily use a break as it is used as a last resort of the switch statement
    //But if we miss any of these, then our code will run forever



    //Here are more resources for conditions, if statements, and switch
    //https://www.baeldung.com/java-ternary-operator
    //https://www.w3schools.com/JAVA/ref_keyword_switch.asp
    //https://www.geeksforgeeks.org/java/java-if-else-statement-with-examples/

}
