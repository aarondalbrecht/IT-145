import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////menu variable
        String menuInput = "";

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	    // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	    // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    
        while (!menuInput.equalsIgnoreCase("q")) {
            displayMenu();
            menuInput = scanner.nextLine();
            switch(menuInput) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals("4");
                    break;
                case "5":
                    printAnimals("5");
                    break;
                case "6":
                    printAnimals("6");
                    break;
                default:
                    if(!menuInput.equalsIgnoreCase("q")) {
                        System.out.println("Invalid input, please choose again.");
                    }
                break;
            }
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Dan", "male", "4", "39.2", "09-12-2020", "United States", "in service", true, "United States", "Macaque", 15.5, 28.3, 24.7);

        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        //prompt and input for breed
        System.out.println("What is the new dog's breed?");
        String breed = scanner.nextLine();

        //prompt and input for gender
        System.out.println("What is the new dog's gender?");
        String gender = scanner.nextLine();

        //prompt and input for age
        System.out.println("What is the new dog's age?");
        String age = scanner.nextLine();

        //prompt and input for weight
        System.out.println("What is the new dog's weight?");
        String weight = scanner.nextLine();

        //prompt and input for acquisition date
        System.out.println("What is the acquisition date (MM-DD-YYYY) for the new dog?");
        String acquisitionDate = scanner.nextLine();

        //prompt and input for acquisition country
        System.out.println("From what country was the new dog acquired?");
        String acquisitionCountry = scanner.nextLine();

        //prompt and input for training status
        System.out.println("What is the new dog's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service)?");
        String trainingStatus = scanner.nextLine();

        //prompt and input for reserved status
        System.out.println("Is the new dog reserved?  Enter True or False");
        boolean reservedStatus = scanner.nextBoolean();
        scanner.nextLine();

        //prompt and input for in service country
        System.out.println("What is the new dog's in-service country?");
        String inServiceCountry = scanner.nextLine();

        //creating the new object dog
        Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reservedStatus, inServiceCountry);

        //adding object dog to dog list
        dogList.add(dog);
        System.out.println("The new dog has been added.");
    }


    // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;  //returns to menu
            }
        }

        //prompt and input for gender
        System.out.println("What is the new monkey's gender?");
        String gender = scanner.nextLine();

        //prompt and input for age
        System.out.println("What is the new monkey's age?");
        String age = scanner.nextLine();

        //prompt and input for weight
        System.out.println("What is the new monkey's weight?");
        String weight = scanner.nextLine();

        //prompt and input for acquisition date
        System.out.println("What is the acquisition date (MM-DD-YYYY) for the new monkey?");
        String acquisitionDate = scanner.nextLine();

        //prompt and input for acquisition country
        System.out.println("From what country was the new monkey acquired?");
        String acquisitionCountry = scanner.nextLine();

        //prompt and input for training status
        System.out.println("What is the new monkey's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service)?");
        String trainingStatus = scanner.nextLine();

        //prompt and input for reserved status
        System.out.println("Is the new monkey reserved?  Enter True or False");
        boolean reservedStatus = scanner.nextBoolean();
        scanner.nextLine();

        //prompt and input for in service country
        System.out.println("What is the new monkey's in-service country?");
        String inServiceCountry = scanner.nextLine();

        //prompt and input for species
        System.out.println("What is the new monkey's species?");
        String species = scanner.nextLine();

        //verification if species added is valid
        while(!(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin").contains(species))) {
            System.out.println("Ineligible monkey species.  Eligible monkey species: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin");
            System.out.println("Please enter a valid species: ");
            species = scanner.nextLine();
        }

        //prompt and input for tail length
        System.out.println("What is the new monkey's tail length?");
        double tailLength = scanner.nextDouble();
        scanner.nextLine();

        //prompt and input for height
        System.out.println("What is the new monkey's height?");
        double height = scanner.nextDouble();
        scanner.nextLine();

        //prompt and input for body length
        System.out.println("What is the new monkey's body length?");
        double bodyLength = scanner.nextDouble();
        scanner.nextLine();

        //creating the new object monkey
        Monkey monkey = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reservedStatus, inServiceCountry, species, tailLength, height, bodyLength);

        //adding object monkey to monkey list
        monkeyList.add(monkey);
        System.out.println("The new monkey has been added.");
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        //prompts for inputing animal type and service country
        System.out.println("Is the animal you wish to reserve a dog or monkey?");
        String animalType = scanner.nextLine();
        System.out.println("What is the service country for the animal?");
        String inServiceCountry = scanner.nextLine();

        //check for dog availability and reserve
        boolean reservation = false;
        if(animalType.equalsIgnoreCase("Dog")) {
            for(Dog dog: dogList) {
                if(dog.getReserved() == false && dog.getInServiceCountry().equalsIgnoreCase(inServiceCountry) && dog.getTrainingStatus() == "in service") {
                    dog.setReserved(true);
                    System.out.println("You have reserved " + dog.toString());
                    reservation = true;
                    return;
                }
            }
            if(reservation == false) {
                System.out.println("There are no dogs available for reservation at this location.");
            }
        }

        //check for monkey availablity and reserve
        else if(animalType.equalsIgnoreCase("Monkey")) {
            for(Monkey monkey: monkeyList) {
                if(monkey.getReserved() == false && monkey.getInserviceCountry().equalsIgnoreCase(inServiceCountry) && monkey.getTrainingStatus() == "in service") {
                    monkey.setReserved(true);
                    System.out.println("You have reserved " + monkey.toString());
                    reservation = true;
                    return;
                }
            }
            if(reservation == false) {
                System.out.println("There are no monkeys available for reservation at this location.");
            }
        }

        //
        else {
            System.out.println("Invalid animal type.  Please reselect from the main menu.");
        }
    }


    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String listType) {
        //print for all dogs
        if(listType.equals("4")) {
            for(int i = 0; i < dogList.length; ++i) {
                System.out.println(dogList.get(i).toString());
            }
        }

        //print for all monkeys
        else if(listType.equals("5")) {
            for(int i = 0; i < monkeyList.length; ++i) {
                System.out.println(monkeyList.get(i).toString());
            }
        }

        //print for all animals
        else if (listType.equals("6")) {
            //printing available dogs
            for (int i = 0; i < dogList.length; ++i) {
                if(dogList.get(i).getTrainingStatus() == "in service" && dogList.get(i).getReserved() == false) {
                    System.out.println(dogList.get(i).toString());
                }
            }
            //printing available monkeys
            for(int i = 0; i < monkeyList.length; ++i) {
                if(monkeyList.get(i).getTrainingStatus() == "in service" && monkeyList.get(i).getReserved() == false) {
                    System.out.println(monkeyList.get(i).toString());
                }
            }
        }
    }
}
