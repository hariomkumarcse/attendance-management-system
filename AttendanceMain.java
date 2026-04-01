import in.ac.mitmeerut.attendance.AttendanceExtractor;
import in.ac.mitmeerut.attendance.LowAttendanceException;
import in.ac.mitmeerut.student.Student;

class AttendanceMain {
    public static void main(String args[]) {
        try {
            AttendanceExtractor ext = new AttendanceExtractor();
            Student student = ext.findStudentByRollNumber(args[0]);

            if (student != null)
                System.out.println(student);
            else
                System.out.println("Student not found");

        } catch (LowAttendanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}