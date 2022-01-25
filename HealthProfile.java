package BMI;

public class HealthProfile {
    //instance variable
    private String name;
    private String lastName;
    private char gender;
    private int day, month, year;
    private double height;
    private int weight;

    //constructor
    public HealthProfile(String name, String lastName, char gender, int day, int month, int year, double height, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getODB() {
        return String.format("%d/ %d/ %d/", day, month, year);
    }

    public int getAge() {
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - year;
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }

    public double bmiValues() {
        double BMI = getWeight() / (getHeight() * getHeight());
        return BMI;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n' +
                        "LastName: " + lastName + '\n' +
                        "Gender: " + gender + "\n" +
                        "Day: " + day + "\n" +
                        "Month: " + month + "\n" +
                        "year: " + year + "\n" +
                        "Height: " + height + "\n" +
                        "Weight: " + weight;
    }

    public String disp() {
        return "Name: " + name + '\n' +
                "LastName: " + lastName + '\n' +
                "Gender: " + gender + "\n" +
                "Day: " + day + "\n" +
                "Month: " + month + "\n" +
                "year: " + year + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                "Years of age: " + getAge() + "\n" +
                "BMI: " + bmiValues() + "\n" +
                "Max Heart Rate: " + getMaxHeartRate() + "\n" +
                "Target Heart Rate: " + getTargetHeartRate();
    }

}
