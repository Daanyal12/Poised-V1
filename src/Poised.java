//import the input scanner
import java.util.Scanner;
public class Poised {
//  set main to run all users inputs
    public static void main(String[] args) {
//      welcome user to program and take their input
        System.out.println("Welcome to Poised project Tracker ");

//        System.out.println("\n");
        System.out.println("Type 'start' and click enter");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        
//      while userinput is not quit run the loop
        while (!userInput.equals("3")){

            //prompt user to type new to create new project by typing new
            System.out.println("enter what youd like to do?:\nenter 1,2 or 3: \n1 - project \n2 - person \n3 - quit");
            userInput = sc.next();

        //the reason this is a if statement is so that later on when we add more functionality we can just add more if statements
        if (userInput.equals ("1")){

//          calls the make project function
            makeProject();

//          this second section triggers the person class witch generates a new person object
        } else if (userInput.equals("2")) {

//          calls the make person function
            makePerson();
            }

        else if (userInput.equals("3")) {
            System.out.println("Good Bye");
            break;
        }

        }
    }
        public static void makeProject(){
            Scanner sc = new Scanner(System.in);
            System.out.println("making project");
            //          runs the inputs for the purpose of creating a new Project object
            System.out.println("enter the name of the project: eg. Mike-Tysons-house");
            String pjtName = sc.next();

            System.out.println("enter the Project number: ");
            String pjtNum = sc.next();

            System.out.println("enter the type of building eg. house,apartment,mansion: ");
            String buildType = sc.next();

            System.out.println("enter the Address of the building eg. no.8-Block-rd-plumstead: ");
            String address = sc.next();

            System.out.println("enter the ERF no. : ");
            int erf1 = sc.nextInt();

            System.out.println("enter the total amount : ");
            int amount = sc.nextInt();

            System.out.println("enter the total paid : ");
            int paid = sc.nextInt();

            System.out.println("enter the deadline eg.dd-mm-yyyy: ");
            String deadline = sc.next();

//          calls the project class with attributes of the users inputs
            Project first = new Project(pjtName, pjtNum, buildType, address, erf1, amount, paid, deadline );

//          prints the toString with all the users inputed results
            System.out.println(first);

//          once thats done the user gets propted with the option to edit the deadline or the total paid
            System.out.println("would you like to edit anything? yes or no: ");
            String edit = sc.next();

//          if the user selects yes the option of dead line or total paid gets offered
            if (edit.equals("yes")){
                System.out.println("what would you like to edit?\ndeadline - d:\ntotal paid - p");
                String edit2 = sc.next();

//                if the user selects d the set deadline method gets called using the users new input being the new deadline
                if (edit2.equals("d")){
                    System.out.println("enter new deadline dd-mm-yyyy");
                    String newDeadline = sc.next();

                    first.setDeadline(newDeadline);

//                  prints out the updated class
                    System.out.println(first);

//                if the user selects p the set total method gets called with the users input of the new total
                } else if (edit2.equals("p")) {
                    System.out.println("enter new total paid");
                    int newTot = sc.nextInt();

                    first.setTotalPaid(newTot);

//                  prints out updated class
                    System.out.println(first);
                }

            }else {
                System.out.println("goodbye");

            }

    }

    public static void makePerson(){
        Scanner sc = new Scanner(System.in);
        //            prompts the user to input all the values needed to create this class
        System.out.println("enter the persons Title eg. architect: ");
        String pTitle = sc.next();

        System.out.println("enter the persons name: eg. daanyal-kamish");
        String pName = sc.next();

        System.out.println("enter the persons contact number : ");
        int pContact = sc.nextInt();

        System.out.println("enter the Address of the person eg. no.8-Block-rd-plumstead: ");
        String pAddy = sc.next();

        System.out.println("enter the Email of the person: ");
        String pMail = sc.next();

//          calls the class with all the users inputed values
        Person guy = new Person(pTitle, pName, pContact, pAddy, pMail);

//            prints out the toString
        System.out.println(guy);

//          once complete it asks the user if they would like to edit anything
        System.out.println("would you like to edit this persons contact?: yes/no? ");
        String userChoice = sc.next();

//            if they select yes they get propmted to enter the new contact number
        if (userChoice.equals("yes")){
            System.out.println("enter the new contact number");
            int newnum = sc.nextInt();

//                calls the setter onto this object with the value of the new input
            guy.setNumber(newnum);

            //prints out the updated person object
            System.out.println(guy);

        }
//            else if the user enters no the process ends
        else if (userChoice.equals("no")){
            System.out.println("goodbye");
        }
    }

    }


