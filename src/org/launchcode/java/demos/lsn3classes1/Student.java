package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;


//    private String name;
    public String getName(){
        return name;
    }
    public String setName(){
        this.name = name;
        return null;
    }
//    private int studentId;

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(){
        this.studentId = studentId;
    }
//    private int numberOfCredits = 0;

    private int getNumberOfCredits(){
        return numberOfCredits;
    }

    private void setNumberOfCredits(int NumberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
//    private double gpa = 0.0;

    public double getGpa(){
        return gpa;
    }
    public void setGpa(){
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = "Mars";
        this.studentId = 123456;
        this.numberOfCredits = 1;
        this.gpa = 4.0;
    }

}