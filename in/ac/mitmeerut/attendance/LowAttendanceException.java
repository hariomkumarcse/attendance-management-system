package in.ac.mitmeerut.attendance;

public class LowAttendanceException extends Exception {

    public LowAttendanceException(String name, String rollNumber) {
        super(name + ", (" + rollNumber + ") is detained from appearing in the examination due to attendance below 75%.");
    }
}