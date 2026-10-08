public class Dog extends Pet {
    //class variables
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    //class constructor
    public Dog() {
        dogSpaceNumber = 0; //sets space to a "non-space" initially
        dogWeight = 0.0; //sets weight to zero initially
        grooming = false; //sets grooming as false initially
    }

    //Accessors and Mutators
    public int getDogSpaceNumber() { //returns private dogSpaceNumber
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int spaceNum) { //sets private dogSpaceNumber
        dogSpaceNumber = spaceNum;
    }

    public double getDogWeight() { //returns private dogWeight
        return dogWeight;
    }

    public void setDogWeight(double weight) { //sets private dogWeight
        dogWeight = weight;
    }

    public boolean getGrooming() { //returns private grooming
        return grooming;
    }

    public void setGrooming(boolean groomchoice) { //sets private grooming
        grooming = groomchoice;        
    }
}
