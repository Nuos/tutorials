
//***********************************************************************//
//									 //
//	- "Talk to me like I'm a 3 year old!" Programming Lessons -	 //
//                                                                       //
//	$Author:	Ben Humphrey	digiben@gametutorials.com	 //
//									 //
//	$Program:	IfStatement    					 //
//									 //
//	$Description:	Displays different messages depending on an age  //
//									 //
//***********************************************************************//

// This tutorial shows us how to use "if/else statements" to control the
// flow of our program.  For instance, if you wanted to ask someone's age
// and then display different messages to the screen depending on their
// age, you would need an if and else statement.  We do exactly that in this
// lesson.  We also cover "variables" more thoroughly.  Essentially,
// a variable is a way to store a value so that we can use or check it later.
// For example, we first want to ask the user's age and store the age in
// a "variable".  We then use the variable to check if the age is under or
// over a certain age so that we can display custom messages depending on age.
// Each variable has a type.  If you want to store a string of character, a
// whole number, a floating point number (a number with a decimal), etc.,
// then you need to specify the variable type BEFORE you use it.  Below are
// some of the basic variables that you will probably want to use:
//
// int     - whole numbers like 1, 2, 200, etc...
// float   - decimal numbers like 1.543, 354.6789, etc...
// double  - larger, more precise decimal numbers like 3.1598473234, etc...
// string  - character strings like "Don't call me Shirley, my name is Ed!"
//
// When using the next() function it returns a "string" of characters, but
// we want an integer for this tutorial, so we use the nextInt() function.
// This returns an integer (or number).
//
// Check out the if statements in the code and learn some new concepts.

// Import the Scanner object so we can use the nextInt() function to read input
import java.util.Scanner;

// Create our Main class for the application
public class Main
{
    // Start our main() function for our program
    public static void main(String[] args)
    {
        // This is how we create a variable.  You first specify the type in
        // front, then a space, then the unique variable name.  So below we
        // create a variable named "age" of type "int".  Notice that we also
        // initialize the variable to "0" by saying "= 0" with a ';' at the end.
        // Remember that variable types and names are case sensitive so be careful.
        int age = 0;

        // Print to the screen a question about the users age
        System.out.println("How old are you? ");			

        // Just like in the KeyboardInput tutorial, in order to read in input from
        // the user we need to create a Scanner object and specify that we want
        // it to get input from the keyboard, so we pass in System.in into the
        // object's init function (i.e. constructor function).
        Scanner scan = new Scanner(System.in);
        
        // Now that we have a Scanner object called scan, we can read in an integer.
        // Below we wait for the user to enter a number and store it in "age".
        age = scan.nextInt();

        // Now we want to start checking the value of age to see which messages
        // that we should display.  The syntax for an if statement is: if(<expression>)
        // Below we check if the age is greater than 20.  If so we display a
        // message commenting on the age.  Notice that we create a new scope.
        // If the statement is true, the code in the new scope is executed,
        // otherwise it is ignored and nothing happens.
        if(age > 20)							
        {										// Start of the if statement's scope
            // Print a message to the screen about being over 20 years old
            System.out.println("You're over 20 huh?");
        }										// End the if statement's scope

        // The next if statement shows some different syntax when checking if
        // the age is over 30 years old.  See how we don't use a scope for this
        // if statement?  Technically, you only need to use a scope if the
        // code is over one line of code (or more than one semicolon statement).
        // It is customary to always indent with the tab key like shown below,
        // even though there isn't an expressed scope, since it is a new scope,
        // but you just can't see it :)

        // If the age is also over 30 then display another message too
        if(age > 30)							
            System.out.println("You're over 30!?");	

        // If the user typed 35 as their age the program would print out both messages
        // above, But if they entered something like 25, it would only print the first one.

        // Below is another coding style...  people who put their '{' after the 
        // conditional statement.  This doesn't do anything different, it's just 
        // that some people prefer it.  There are some languages that REQUIRE it, 
        // but C/C++/C# are VERY flexible in this regard.  

        // If the user is less than 20 print a different message
        if (age < 20) {  							
            System.out.println("You're a young'n!");
        }

        // Next we have something new.  The "&&" means "and".  So the statement is saying, 
        // "if ( age is less than 20 AND greater than 12)".  You will use this type of 
        // expression a lot.  There is also this: "!=" which means "does not equal" and "||"
        // which means "or".  So instead of checking if both things are true, you can check if 
        // one or the other are true by using "||"; the OR operator.  If you are familiar with 
        // the binary operators, "&", and "|" .... these are similar, but different.  "&&" and 
        // "||" check conditions between two statements.  
        
        // If the user is a teenager print a new message to them
        if(age < 20 && age > 12)				
        {										
            System.out.println("Being in your teens can be tough...");
        }

        // This checks if "age equals 100".  This is different than "age = 100".  The
        // "==" is a boolean check that returns a "true" or "false", where the '=' is
        // an assigning operator just like you would expect in math class.
        if(age == 100)							
            System.out.println("WOW!  What's your secret!?");
        
        // Now that we have gone over if statements, let's show how to do else statements.
        // If you want to check if the age is greater than 50, then print a message, but
        // print another message if the age 50 and under you can do the following:
        if(age > 50)							
            System.out.println("Life after 50 can be great!");
        else									
            System.out.println("You've still got a LONG way to go...");

        // In programming you will want to check if something is true, do something,
        // otherwise do something else.  The else statement works nearly the same
        // as the if statement  When you have if and else statements you will only
        // get one result, either one or the other.  You can even do an "else if(<exp>)"
        // statement that works just like an if statement.  As we go into more tutorials
        // you will see more examples on how to use these statements.
    }
}


///////////////////////////////////////////////////////////////////////////////
//
// * Quick Notes *
//
// So we went over using variables and if/else statements.  Basically, to create
// a variable you use the syntax:
//
// <type> <name>;
//
// Like:
//
// int myNumber;
//
// If you want to initialize the variable you can say:
//
// int myNumber = 0;
//
// Or:
//
// String strName = "GameTutorials";
//
// Now, using if/else statements is just as simple:
//
// if(<expression>)
// {
//
// }
// else if(<expression>)
// {
//
// }
// else
// {
//
// }
//
// For example:
//
// if(number == 20)
// {
//    System.out.println("It's 20!");
// }
// else if(number == 40)
// {
//    System.out.println("It's 40!");
// }
// else
// {
//    System.out.println("It's neither 20 or 40!");
// }
//
// What about if you want to check string values?  For example, say you want
// to check if the user typed in a "yes" or "no"?  Check this code out below:
//
// System.out.println("Do you want to borrow my Porsche for your date? ");
// String strAnswer = scan.next();
//
// if(strAnswer == "yes")
//      System.out.println("Yah right, go make your own millions!");
// else
//      System.out.println("What?  You're just Jealous???");
// 
// When we want to check strings we just need to enclose them in double quotes.
// It works just like numbers would, but with double quotes around the values.
//
// Be sure you are comfortable with using if statements.  You will use them
// everywhere in your code.  Once you have tried to create your own program
// with some if statements to practice the concepts, jump to the next tutorial
// shows you how to do loops; specifically "for loops".
//
//
// � 2000-2006 GameTutorials