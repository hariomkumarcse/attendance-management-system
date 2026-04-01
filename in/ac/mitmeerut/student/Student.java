package in.ac.mitmeerut.student;

public class Student {
    private String studentName;
    private int totalLecture;
    private int totalPresent;
    private double totalPercentage;
    private String rollNumber;

    // Parameterized Constructor
    public Student(String studentName, String rollNumber, int totalLecture, int totalPresent) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.totalLecture = totalLecture;
        this.totalPresent = totalPresent;
        this.totalPercentage = (double) totalPresent / totalLecture * 100;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalLecture() {
        return totalLecture;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public double getTotalPercentage() {
        return totalPercentage;
    }

    // toString()
    @Override
    public String toString() {
        return "Student Details:\n" +
               "Name: " + studentName + "\n" +
               "Roll Number: " + rollNumber + "\n" +
               "Total Lectures: " + totalLecture + "\n" +
               "Total Present: " + totalPresent + "\n" +
               "Attendance %: " + totalPercentage;
    }
}