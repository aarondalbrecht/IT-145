public class Monkey extends RescueAnimal {
    //class variables
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    //default constructor
    public Monkey() {
        super();
    }

    //detailed  constructor
    public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
        String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
        String species, double tailLength, double height, double bodyLength) {
            
            //setting RescueAnimal variables
            setAnimalType("monkey"); //ensures type is set correctly
            setName(name);
            setGender(gender);
            setAge(age);
            setWeight(weight);
            setAcquisitionDate(acquisitionDate);
            setAcquisitionCountry(acquisitionCountry);
            setTrainingStatus(trainingStatus);
            setReserved(reserved);
            setInServiceCountry(inServiceCountry);
            
            //setting Monkey variables
            setSpecies(species);
            setTailLength(tailLength);
            setHeight(height);
            setBodyLength(bodyLength);
    }

    //getters
    public String getSpecies() {
        return species;
    }

    public double getTailLength() {
        return tailLength;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    //setters
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    public void setTailLength(double monkeyTailLength) {
        tailLength = monkeyTailLength;
    }

    public void setHeight(double monkeyHeight) {
        height = monkeyHeight;
    }

    public void setBodyLength(double monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

}
