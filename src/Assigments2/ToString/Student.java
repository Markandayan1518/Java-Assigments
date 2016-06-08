package Assigments2.ToString;


public class Student {

    private String studentName;
    private int age;
    private Address address;

    /*
     * Here within Student class Address class is used a instance variable i.e.
     * Each and every student object will have a address within it Student
     * "has-a" address. "Aggregation relationship"
     */
    private double courseFee;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "-----------------Student Details---------------- "
                + "\n Student Name \t:\t " + studentName
                + "\n Age          \t:\t " + age
                + "\n Address      \t:\t " + address
                + "\n Course Fee   \t:\t " + courseFee
                + "\n-------------------------------------------------";
    }
}
