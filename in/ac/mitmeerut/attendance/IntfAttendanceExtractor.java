package in.ac.mitmeerut.attendance;

import in.ac.mitmeerut.student.Student;

public interface IntfAttendanceExtractor {
    Student findStudentByRollNumber(String rollNumber) throws LowAttendanceException;
}