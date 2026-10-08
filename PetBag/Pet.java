public class Pet {
    //class variables
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    //class constructor
    Pet() {
        petType = "None";  //sets type to none
        petName = "No Name";  // sets name to no name
        petAge = -1;  //sets age to -1 initially
        daysStay = -1;  //sets stay length to -1 initially
        amountDue = 0.0;  // sets amount due to 0 until updated with services
    }

    //class accessors and mutators
    public String getPetType() {  //returns the private petType
        return petType;
    }
    
    public void setPetType(String dogOrCat) {  //sets the petType to the parameter given
        petType = dogOrCat;
    }

    public String getPetName() {  //returns the private petName
        return petName;
    }

    public void setPetName(String name) {  //sets the petName to the parameter given
        petName = name;
    }

    public int getPetAge() {  //returns the private petAge
        return petAge;
    }

    public void setPetAge(int age) {  //sets the petAge to the parameter given
        petAge = age;
    }

    public int getDogSpaces() {  //returns the private dogSpaces
        return dogSpaces;
    }

    public void setDogSpaces(int spaceForDog) {  //sets the dogSpaces to the parameter given
        dogSpaces = spaceForDog;
    }

    public int getCatSpaces() {  //returns the private catSpaces
        return catSpaces;
    }

    public void setCatSpaces(int spaceForCat) {  //sets the catSpaces to the parameter given
        catSpaces = spaceForCat;
    }

    public int getDaysStay() {  //returns the daysStay
        return daysStay;
    }

    public void setDaysStay(int days) {  //sets the daysStay to the parameter given
        daysStay = days;
    }

    public double getAmountDue() {  //returns the private amountDue
        return amountDue;
    }

    public void setAmountDue(double amount) {  //sets the amountDue to the parameter given 
        amountDue = amount;        
    }

}
